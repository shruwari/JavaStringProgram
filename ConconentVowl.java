package FinalStringProgram;

public class ConconentVowl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Shruti";
		str= str.toLowerCase();
		int Vcount=0;
		int Ccount =0;
		
for (int i=0;i<str.length();i++)
{
	char ch =str.charAt(i);
	
	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
 {Vcount++;}
	else
	{Ccount++;}
	
}


		System.out.println("Vowel count  " + Vcount);
		System.out.println("Conconent count  " +Ccount);
		
}

}
