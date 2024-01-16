/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        String sNew = "";
        char c;

        for(int i=0; i < s.length(); i++)
        {
            c = s.charAt(i);
            if((c >= 'A') && (c <= 'Z'))
               { // It's not very common identations. See Java Code Style Guide document in the moodle
                 sNew = sNew + (char)(c+32);
               } 
            else
                {
                    sNew = sNew + c;
                }

        }
        return sNew;
    }
}
