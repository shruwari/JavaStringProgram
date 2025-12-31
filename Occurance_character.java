package FinalStringProgram;

import java.util.HashMap;
import java.util.Set;

public class Occurance_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String str = "I am an automation Tester!";
	
	char[] charArr=str.toCharArray();
	
	HashMap<Character,Integer> hm = new HashMap<>();
	for(char c:charArr)
	{
		if(!hm.containsKey(c))
		{
			hm.put(c,1);
		}
		else
		{
			hm.put(c, hm.get(c)+1);
		}
	}
	
	
	Set<Character> set = hm.keySet();
	
	for(char ch : set)
	{
		System.out.println("Character : " + ch + "    Occurance  : "+ hm.get(ch) );
	}
	
	// 
	}
	
	

}
