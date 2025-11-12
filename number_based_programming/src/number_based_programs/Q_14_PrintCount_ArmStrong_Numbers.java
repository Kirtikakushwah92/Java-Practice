package number_based_programs;
// WAJP to print and count all the Armstrong numbers up to 100.
import java.util.Scanner;
public class Q_14_PrintCount_ArmStrong_Numbers {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter range: ");
				int range = sc.nextInt(); int count=0;
				for(int i=1;i<=range;i++) {
				if(isArmStrong(i)) {
					System.out.println(i);
					count++;
				}
				
			}
				System.out.println("Total ArmStrong number : "+count);
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
