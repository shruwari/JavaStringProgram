package FinalStringProgram;

public class SecondHighestCharacter {

	public static void main(String[] args) {
        String str = "automation";

        Character result = getSecondHighestChar(str);

        if (result != null) {
            System.out.println("Second highest character: " + result);
        } else {
            System.out.println("Second highest character not found");
        }
    }

    public static Character getSecondHighestChar(String str) {
        if (str == null || str.length() < 2) {
            return null;
        }

        char highest = Character.MIN_VALUE;
        char secondHighest = Character.MIN_VALUE;

        for (char ch : str.toCharArray()) {

            if (ch > highest) {
                secondHighest = highest;
                highest = ch;
            } 
            else if (ch > secondHighest && ch < highest) {
                secondHighest = ch;
            }
        }

        return (secondHighest == Character.MIN_VALUE) ? null : secondHighest;
    }
}
