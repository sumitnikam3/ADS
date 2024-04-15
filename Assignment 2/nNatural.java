import java.util.Scanner;
	public class nNatural {
		static int sum(int n ){
		if (n>0)
			return n+sum(n-1);
		else
			return 0;
		}
		public static void main(String[] args ){
			Scanner sc =new Scanner(System.in);
			int result = sum(sc.nextInt());
			System.out.print(result);
		}
	}