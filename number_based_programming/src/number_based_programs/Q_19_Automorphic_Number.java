package number_based_programs;
// WAJP to take user input and print whether the number is Automorphic number or not.
import java.util.Scanner;
public class Q_19_Automorphic_Number {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number  : ");
			int n = sc.nextInt();
			if(isAutomorphic(n)) {
				System.out.println(n+" is Automorphic number ...");
			}
			else
				System.out.println(n+" is not Aotumorphic number.....");
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
