package number_based_programs;
// WAJP to print and count all the Happy numbers up to 100.
import java.util.Scanner;
public class Q_18_Print_Count_Happy_Number {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter range  : ");
			int range = sc.nextInt();
			int count=0;
			for(int i=1;i<=range;i++) {
			if(isHappy(i)) {
				System.out.println(i);
				count++;
			}
			}
			System.out.println("Total happy number is : "+count);
		}
	public static boolean isHappy(int n) {
		while(n>9) {
			int sum =0;
			while(n>0) {
				int rem = n%10;
				sum = sum + rem*rem;
				n/=10;
				
			}
			n=sum;
		}
		return n==1 || n==7;
	}
}
