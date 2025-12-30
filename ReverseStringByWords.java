package FinalStringProgram;

public class ReverseStringByWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ReverseByWords("I am an Automation Tester!"));
	}
	
	
	static String ReverseByWords(String str)
	{
		String []  strArr= str.split("");
		String nstr="";
		
for (int i=0;i<strArr.length;i++)
{		
String word = strArr[i];

    for (int j=0;j<word.length();j++)
   {
	nstr = word.charAt(j)+nstr;
   }

}
		return nstr;
}

	
	
	}

