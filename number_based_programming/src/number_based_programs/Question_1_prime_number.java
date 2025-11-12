package number_based_programs;
import  java.util.Scanner;
// WAJP to take user input and print whether the number is Prime number or not.
public class Question_1_prime_number {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number : ");
				int n = sc.nextInt();
				if(isPrime(n)) {
					System.out.println(n +" is prime number ");
				}
				else {
					System.out.println(n+" is not prime number !");
				}
		}
		public static boolean isPrime(int n) {
			if(n<2)
				return false;
			else if(n==2 || n==3)
				
				return true;
			else if(n%2==0)
				return false;
			for(int i=3;i*i<=n;i+=2) {
				if(n%i==0)
					return false;
			}
			return true;
			
		}
}
