package FinalStringProgram;

public class Palingdrom {

    public static void main(String[] args) {

        // 1. get one string
        String str = "MAMDAM";

        System.out.println(Palingdrom.palingdrome_find(str));
    }

    static boolean palingdrome_find(String str) {

        int start = 0;
        int end = str.length() - 1;

        str = str.toLowerCase();

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
                
            }
           

            start++;
            end--;
        }
        return true;

        
    }
}

