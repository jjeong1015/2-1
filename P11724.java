package Search;
// ���� ���� �׷����� �־����� �� ���� ����� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// 1��° �ٿ� ����� ���� N�� ������ ���� M, 2��° �ٺ��� M���� �ٿ� ������ �糡 �� u�� v�� �־�����. ���� ������ �� ���� �־�����.
// 1��° �ٿ� ���� ����� ������ ����Ѵ�.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11724 {
	private static final Integer Interger = null;
	static ArrayList<Integer>[] A;
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Interger.parseInt(st.nextToken());
		int m = Interger.parseInt(st.nextToken());
		A = new ArrayList[n+1];
		visited = new boolean[n+1];
		for (int i=1; i<n+1; i++) { // ���� ����Ʈ �� ArrayList �ʱ�ȭ�ϱ�
			A[i] = new ArrayList<Integer>();
		}
		for (int i=0; i<m; i++) { // ���� ����Ʈ�� �׷��� ������ �����ϱ�
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e); // ����� �����̹Ƿ� ���ʿ� ������ ���ϱ�
			A[e].add(s);
		}
		int count=0;
		for (int i=1; i<n+1; i++) { 
			if (!visited[i]) { // �湮���� ���� ��尡 ���� ���
				count++; // ���� ��� ���� �߰�
				DFS(i); // DFS ����
			}
		}
		System.out.println(count);
	}
	
	static void DFS(int v) {
		if (visited[v]) { // ���� ��� == �湮�� ���
			return;
		}
		visited[v]=true; // �迭�� ���� ��� �湮 ����ϱ�
		for (int i:A[v]) {
			if (visited[i] == false) { // ���� ��� �� �湮���� �ʾҴ� ��� DFS Ž���ϱ� (��� �Լ�)
				DFS(i);
			}
		}
	}
	
	/*
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("��� ����, ���� ������ �Է��ϼ��� : ");
		long node = scanner.nextLong();
		long edge = scanner.nextLong();
		
		for(int i=0; i<edge; i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();
		}
		// ���� �Լ� ȣ���ؼ� ��ũ�帮��Ʈ�� ������ ������ ���� �����ϱ�
	}
	*/
}