package Greedy;
// 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성
// 1번째 줄에 N, K 2번째 줄부터 N 개의 줄에 동전의 가격 A[]가 오름차순으로 주어짐
// 1번째 줄에 K 원을 만드는 데 필요한 동전 개수의 최솟값 출력
import java.util.Scanner; // Similar to stdio.h that inputs, outputs

public class P11047 {
	public static void main(String[] args) {
		int N;
		int K;
		Scanner scanner = new Scanner(System.in); // Receive inputs -> ex) class name object name = new class name();
		
		do {
			N = scanner.nextInt(); // Coin of type -> 1<=N<=10, scanner = object name
		} while (N<1 || N>10);
		
		do {
			K = scanner.nextInt(); // Target amount -> 1<=K<=100,000,000, int type input and return
		} while (K<1 || K>100000000);
		
		int A[] = new int[N]; // Declare and initialize arrays(Securing seats as many as the coin types) -> 1<=A[]<=1,000,000
		
		for (int i=0; i<N; i++) { // Inserting a Coin Type into an Array
			A[i] = scanner.nextInt();
		}
		
		int count = 0; // Counting coins in
		for (int i=N-1; i>=0; i--) { // Large coins must be selected first to minimize the number of coins
			if (A[i] <= K) { // If the amount of coins is equal to or less than the current K (target amount)
				count += (K / A[i]); // the number of coins += target amount / current coin amount -> How many coins can you put in the current type
				K = K % A[i]; // target amount = target amount % current coin amount -> Put it in and do it again with the remaining amount
			}
		}
		System.out.println(count);
	}
}
