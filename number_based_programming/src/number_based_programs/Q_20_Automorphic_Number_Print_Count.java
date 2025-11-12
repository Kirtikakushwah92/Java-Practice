package number_based_programs;
// WAJP to print and count all the  Automorphic numbers up to 100.
import java.util.Scanner;
public class Q_20_Automorphic_Number_Print_Count {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number  : ");
			int range = sc.nextInt();
			int count=0;
			for(int i=0;i<=range;i++) {
			if(isAutomorphic(i)) {
				System.out.println(i);
				count++;
			}
			}
			System.out.println("Total automorphic number : "+count);
	}
	public static boolean isAutomorphic(int n) {
		int sq = n*n;
		while(n>0) {
			if(n%10 != sq%10)
				return false;
		n/=10;
		sq/=10;
		}
		return true;
	}
}
