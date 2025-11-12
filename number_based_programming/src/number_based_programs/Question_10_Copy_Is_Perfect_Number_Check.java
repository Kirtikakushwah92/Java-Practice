package number_based_programs;
//WAJP to print and count all the  perfect numbers
import java.util.Scanner;
public class Question_10_Copy_Is_Perfect_Number_Check {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number : ");
				int n = sc.nextInt();
				if(isPerfect(n)) {
					System.out.println(n+" is perfect number ...");
				}
				else
					System.out.println(n +" is not a perfect number ...");
	}
	public static boolean isPerfect(int n){
		
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		
		}
		
		return n==sum;
	}
}
