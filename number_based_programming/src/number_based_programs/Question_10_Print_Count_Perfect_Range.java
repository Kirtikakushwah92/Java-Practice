package number_based_programs;
//WAJP to print and count all the  perfect numbers up to 100
import java.util.Scanner;
public class Question_10_Print_Count_Perfect_Range {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number : ");
				int range = sc.nextInt();
				int count=0;
				for(int i=1;i<=range;i++) {
					if(isPerfect(i)) {
						System.out.println(i);
						count++;
					}
				}
				System.out.println("Total perfect number is = "+count);
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
