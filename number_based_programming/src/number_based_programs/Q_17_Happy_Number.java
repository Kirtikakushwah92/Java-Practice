package number_based_programs;
//Happy Number check -> all digit ka sum krte krte 1 aa jae
import java.util.Scanner;
public class Q_17_Happy_Number {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int n = sc.nextInt();
			if(isHappy(n)) {
				System.out.println(n+" is a Happy Number ");
			}
			else
				System.out.println(n+" is not a Happy number ");
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
