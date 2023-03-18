package week3.day1.StringAssignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		
		char[] ch = test.toCharArray();
		
		for( int i=1 ; i<ch.length ; i++)
		{
			if(i%2!=0) {
			ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);
	}
	

}
