package FinalStringProgram;

public class countNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "I am yureka kid";
		
		int count =0;
		
		
	for (int i=0;i<str.length();i++)
	{
		
		char ch = str.charAt(i);
		
		if (ch != ' ')
      {count++;}		
	}
				
	System.out.println("Number of the words : "+ count);
				
	}

}
