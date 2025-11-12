package number_based_programs;
// WAJP to take user input and print whether the number is Strong number or not.
import java.util.Scanner;
public class Q_11_Is_Strong_Number {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int n = sc.nextInt();
			if(isStrongNumber(n)) {
				System.out.println(n+" is a strong number...");
			}
			else
				System.out.println(n+" is not a strong number...");
		}
		
		public static boolean isStrongNumber(int n) {
			int orignalNum=n;
			int sum =0;
			while(n>0) {
				sum = sum+ getFact(n%10);
				n/=10;
			}
			return sum==orignalNum;
		}
		public static int getFact(int n) {
			int fact=1;
			while(n>0) {
				fact = fact*n;
				n--;
			}
			return fact;
		}
}
