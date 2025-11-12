package number_based_programs;

// WAJP to print and count all the palindrome numbers in a given range.
import java.util.Scanner;

public class Question_7_Count_Palindrome_Given_Range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range : ");
		int range = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= range; i++) {
			if (isPalindrome(i)) {
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
}
