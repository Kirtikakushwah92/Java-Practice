package number_based_programs;
// WAJP to print and count all the  Prime numbers up to a given range.
import java.util.Scanner;
public class Question_2_Count_Prime_Number {
				public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					int count =0;
					System.out.println("Enter Range of Number : ");
					int range = sc.nextInt();
					for(int i =2;i<=range;i++) {
						if(isPrime(i)) {
							System.out.println(i);
							count++;
						}
						
					}
					System.out.println("Total Prime number is : "+count);
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
