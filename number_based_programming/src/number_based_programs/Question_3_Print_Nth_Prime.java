package number_based_programs;
// WAJP to take user input and print nth prime number.
import java.util.Scanner;
public class Question_3_Print_Nth_Prime {
				public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Enter nth Number : ");
					int nthPrimeNo = sc.nextInt();
					int count =0;
					for(int i =2; ;i++) {
						if(isPrime(i)) {
							count++;
							if(count==nthPrimeNo) {
								System.out.println(nthPrimeNo+" Nth Prime number = "+i);
								break;
							}
						}
						
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
