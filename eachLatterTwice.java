package FinalStringProgram;

public class eachLatterTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Shruti";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			sb.append(str.charAt(i)).append(str.charAt(i));		
			
		}
		
System.out.println(sb.toString());		
	}
	

}
