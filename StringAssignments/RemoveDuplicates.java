package week3.day1.StringAssignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] Duplicate = text.split(" ");
		
		StringBuffer sb =new StringBuffer();
		
		int len = Duplicate.length;
				
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if (Duplicate[i].equalsIgnoreCase(Duplicate[j]))
				{
					
					Duplicate[j]="";
					
				}
			}
			
		}
		for(int i = 0; i < Duplicate.length; i++) {
	         sb.append(Duplicate[i] + " ");
	      }
		String dd = sb.toString();
		System.out.println(dd);
		
//		for(int k=0; k<len; k++)
//		{
//			if(Duplicate[k]!= " ")
//			{
//				System.out.println(Duplicate[k]);
//			}
//		}
		
		
	}

}
