import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int[][] A = new int[times][3];
		int[] sums = new int[3];
		
		for (int i = 0; i < times; i++) {
			for (int j = 0; j < 3; j++) {
				A[i][j] = sc.nextInt();
				sums[j] = sums[j] + A[i][j];
			}
		}		
		
		if (sums[0] == 0 && sums[1] == 0 && sums[2] == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
