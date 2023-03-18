package week3.day1.StringAssignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester engineer";
		String[] revString = test.split(" ");
		int len = revString.length;
		
		for(int i=1 ; i<len ; i=i+2)
		{
			char[] ch = revString[i].toCharArray();
			int len2 = ch.length;
			String rev = "";
			for(int j=len2-1; j>=0 ; j--)
			{
				rev = rev + ch[j];
				
			}
			revString[i] = rev;
		}
		StringBuffer sb = new StringBuffer();
		for(String r:revString)
		{
			sb.append(r+ " ");
		}
		String dd = sb.toString();
		System.out.println(dd);
		
	}

}
