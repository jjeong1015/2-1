package Greedy;
// �ʿ��� ���� ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ�
// 1��° �ٿ� N,K 2��° �ٺ��� N���� �ٿ� ������ ���� A[]�� ������������ �־���
// 1��° �ٿ� K���� ����� �� �ʿ��� ���� ������ �ּҰ� ���
import java.util.Scanner;
public class P11047 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // ���� ���� -> 1<=N<=10 (while�� ������ �� ��)
		int K = scanner.nextInt(); // ���� �� -> 1<=K<=100,000,000
		int A[] = new int[N]; // ���� ������ŭ �ڸ� Ȯ�� -> 1<=A[]<=1,000,000
		int count = 0; // �� ���� ���� ī��Ʈ
		
		for (int i=0; i<N; i++) {
			A[i] = scanner.nextInt(); // ���� ����(����) �Է� -> ������������ �ޱ�
		}
		
		for (int i=0; i<A.length-1; i++) { // ���� ���� ���� �� �������� ���� -> ū �ź��� �ݾ� ���Ϸ��� �� -> ���� ������ �ּҷ� �ϱ� ���ؼ�
			for (int j=i+1; j<A.length; j++) {
				if (A[i]<A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
			//System.out.print(A[i]);
			//System.out.println(" ");
		}
		
		// ���� ������ �ȵǸ� ��� �ؾ� �ϴ����� ������ �� ��
		for (int i=0; i<A.length; i++) { // �ݾ� ���ϱ�
			if (A[i] <= K) { // �ش� �ݾ��� ���� �պ��� ���ų� ���� ���
				
				count++; // 10��¥�� 2�� ���� ī��Ʈ�� 1���� �ǰ� �� ��
			}
			else
				return;
		}
	}
}
