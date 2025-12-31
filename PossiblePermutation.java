package FinalStringProgram;

public class PossiblePermutation {

	
	    public static void main(String[] args) {
	        String str = "ABC";
	        permute(str, "");
	    }

	    static void permute(String str, String result) {

	        // Base case
	        if (str.length() == 0) {
	            System.out.println(result);
	            return;
	        }

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Remaining string after removing character at index i
	            String remaining = str.substring(0, i) + str.substring(i + 1);

	            permute(remaining, result + ch);
	        }
	    }
	

}