package FinalStringProgram;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	
	
	
String 	A = "Shruti";
String B = "Tiw";

System.out.println("First String: "+A);
System.out.println("Second String " +B);
A=A+B; 
A=A.substring(B.length());
B=A.substring(0,B.length());
System.out.println("new First String  " + A );
System.out.println("new  Second String "+B );

	}

	
	
}
