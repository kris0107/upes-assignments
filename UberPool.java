import static java.lang.Math.abs;
import java.util.Scanner;
public class UberPool
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);

		 int i=0;int j=0;int k=0; int l=0; int m=0;
		 int a[] = new int[2];
		 int b[] = new int[2];
		 int c[] = new int[2];
		 int x[] = new int[2];
		 int y[] = new int[2];

		 for(i=0;i<2;i++)
		 {
		 	a[i] = sc.nextInt();
		 }

		 for(j=0;j<2;j++)
		 {
		 	b[j] = sc.nextInt();
		 }

		 for(k=0;k<2;k++)
		 {
		 	c[k] = sc.nextInt();
		 }

		 for(l=0;l<2;l++)
		 {
		 	x[l] = sc.nextInt();
		 }

		 for(m=0;m<2;m++)
		 {
		 	y[m] = sc.nextInt();
		 }

		int ans = uber(a,b,c,x,y);
		System.out.println(ans);

		
	}
	static int uber(int[] A, int[] B, int[] C, int[] X, int[] Y)
	{
			int d = Math.abs(A[0] - B[0]) + Math.abs(A[1] - B[1]);
			int cd = Math.abs(C[0] - A[0]) + Math.abs(C[1] - A[1]);
			int xd = Math.abs(X[0] - C[0]) + Math.abs(X[1] - C[1]) + Math.abs(X[0] - B[0]) + Math.abs(X[1] - B[1]);
			int yd = Math.abs(Y[0] - C[0]) + Math.abs(Y[1] - C[1]) + Math.abs(Y[0] - B[0]) + Math.abs(Y[1] - B[1]);

			if (xd <= yd && xd > d && yd > d)
				return 1;
			else if (xd > yd && xd > d && yd > d)
				return 2;
			else
				return -1;
	}

}