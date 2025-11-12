package number_based_programs;
//WAJP to take user input and print whether the number is dissarium number or not.
import java.util.Scanner;
public class Q_15_Dissarium_numberCheck {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number :");
			int n = sc.nextInt();
			if(isDissarium(n)) {
				System.out.println(n+" is Dissarium number.....");
			}
			else
				System.out.println(n+" is not a Dissarium number......");
		}
		
		public static boolean isDissarium(int n) {
			int sum =0; int orignalNum=n; int positionCount=getCount(n);
			while(n>0) {
				sum = sum+getPower(n%10,positionCount);
				n/=10;
				positionCount--;
			}
			return sum == orignalNum;
		}
		public static int getCount(int n) {
			int count=0;
			while(n>0) {
				count = count+1;
				n/=10;
			}
			return count;
		}
		
		public static int getPower(int b ,int a) {
			int pow = 1;
			while(a>0) {
				pow = pow*b;
			a--;
			}
			return pow;
		}
}
