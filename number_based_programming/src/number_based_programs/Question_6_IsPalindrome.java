package number_based_programs;
// WAJP to take user input and check the number is palindrome or not.
import java.util.Scanner;
public class Question_6_IsPalindrome {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number : ");
				int n = sc.nextInt();
				if(isPalindrome(n))
					System.out.println(n+" is palindrome number ...!");
				else
					System.out.println(n+" is not palindrome ..");
						
			}
			public static boolean isPalindrome(int n) {
				int Orginal_Number = n;
				int rev =0;  // int rem =n%10;
				while(n>0) {
					rev=rev*10+n%10;  // rev*10+rem;
					n/=10;
				}
				return Orginal_Number == rev;
			}
}
