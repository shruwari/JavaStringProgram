package FinalStringProgram;

public class aabbcccdddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. Get a string
		2. Declare the string builder
		3. if same charaaacter i =i+1 to count ++
		4, append the character and count both .*/
		
		String str= "aabbcccdddd";
       int count =1;
       
		StringBuilder sb = new StringBuilder();
		
		for (int i=0;i<str.length();i++)
{
			if (str.charAt(i) == str.charAt(i+1))
			{ count++;}
			else
			{
				sb.append(str.charAt(i)).append(count);
			count=1;
			}
		
}

		
		System.out.println(sb.toString());

}

}