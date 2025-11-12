package number_based_programs;

// WAJP to print and count all the palindrome numbers in a range which is also a prime number.
import java.util.Scanner;

public class Question_9_Check_Palindrome_Prime_Number_InRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range : ");
		int range = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= range; i++) {
			if (i > 9 && isPalindrome(i) && isPrime(i)) { // i>9 (single number print nahi hoga )
				System.out.println(i + " is palindrome number ...!");
				count++;
			}
		}
		System.out.println("Total palindrome number is : " + count);

	}

	public static boolean isPalindrome(int n) {
		int Orginal_Number = n;
		int rev = 0; // int rem =n%10;
		while (n > 0) {
			rev = rev * 10 + n % 10; // rev*10+rem;
			n /= 10;
		}
		return Orginal_Number == rev;
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		else if (n == 2 || n == 3)
			return true;
		else if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
