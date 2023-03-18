package week3.day1.StringAssignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palindrom = "Malayalam";
		
		char[] ch = palindrom.toCharArray();
		int len = ch.length;
		String rev = "";
		
		for(int i=len-1; i>=0; i--)
		{
			rev= rev + ch[i];
		}
		if(palindrom.equalsIgnoreCase(rev))
		{
			System.out.println("Given String " + rev +" is Palindrome");
		}
		else
		{
			System.out.println("Given string " + rev +" is not palindrome");
		}
	}

}
