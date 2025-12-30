package FinalStringProgram;

public class ReverseString {

	
	
	static String reverseString(String str)
	
	{
		String nstr=" ";
		for (int i=0;i<str.length();i++)
		{
		   nstr = str.charAt(i)+nstr;	
		}
	return nstr;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Shruti";
		
		System.out.println(reverseString(str));
	
	}

}
