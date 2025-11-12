package number_based_programs;
// WAJP to print and count all prime numbers in a range where sum of digits is also prime number.
import java.util.Scanner;
public class Question_5_Print_Prime_Count_Digit_Sums {
				public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter range  : ");
					int range = sc.nextInt();
					int count=0; 
					for(int i=2;i<=range;i++) {
						if(isPrime(i) && isPrime(getSumOfDigit(i))) {
							count++;
							System.out.println(i);
						}
					}	
					System.out.println("Total count is : "+count);
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
				
				public static int getSumOfDigit(int n) {
					int sum=0;
					while(n>0) {
						sum = sum+n%10;
						n/=10;
					}
					return sum;
				}
}
