package number_based_programs;
//WAJP to take user input and print whether the number is an Armstrong number or not.
import java.util.Scanner;
public class Q_13_ArmStrong_Number_Check {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number : ");
				int n = sc.nextInt();
				if(isArmStrong(n)) {
					System.out.println(n+ " is ArmStrong number ...");
				}
				else
					System.out.println(n+" is not a ArmStrong number ..");
			}
			public static boolean isArmStrong(int n) {
				int orignalNumber=n;int sum=0;
				while(n>0) {
					sum = sum+getCube(n%10,3);
					n/=10;
				}
				return sum==orignalNumber;
			}
			
			public static int getCube(int b ,int a) {
				int cube=1;
				while(a>0) {
					cube=cube*b;
					a--;
				}
				return cube;
			}
}
