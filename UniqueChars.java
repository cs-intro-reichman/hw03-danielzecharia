/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        // TODO: ident the code. Should start from here.
    String sNew=""+s.charAt(0);
    boolean found=false;

    for (int i=1; i<s.length();i++)
    {
        if (s.charAt(i)==' ')
            sNew = sNew+s.charAt(i);
        else
        {
                for (int n=0; n<sNew.length();n++)
                {
                    if(sNew.charAt(n)==s.charAt(i))
                        found=true;

                }
                if(found==false)
                    sNew = sNew+s.charAt(i);
                found=false;


            }
        }
        
        return sNew;
    }
}
