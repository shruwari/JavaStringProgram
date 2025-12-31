package FinalStringProgram;

public class removeSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "I am Automation Tester !" ;
		
		//1. Get a string
		//2. Traverse character by character
		//3. If space is not there ....append the character
		//4. print the result.
		
		System.out.println("Old String     >  " + str);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i) != ' ')
			{
				sb.append(str.charAt(i));
				
			}
				
		}
		
		System.out.println("New String >  "+sb.toString());
	}

}
