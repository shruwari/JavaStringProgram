package FinalStringProgram;

public class PrintEvenIndexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Automation";
		
		str = str.toLowerCase();
for (int i=0;i<str.length();i=i+2)
{

	System.out.println("Character : "+str.charAt(i)+" Index  : "+i);
	
}
	
	
	}

}
