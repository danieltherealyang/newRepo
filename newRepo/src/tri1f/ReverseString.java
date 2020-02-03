package tri1f;

public class ReverseString {
    static String reverseString(String string)
    {
        StringBuffer bufferString = new StringBuffer(string);
        bufferString.reverse();
        return bufferString.toString();
    }
    
    public boolean pCheck(String checkString) {
        String check = checkString.toLowerCase();
        check = check.replaceAll("[^a-zA-Z0-9]", ""); //remove nonalphanumeric
        check = check.replaceAll("\\s+",""); 
        String reversed = reverseString(check);
        
        if (checkString.length() <= 1)
        {
            return false;                
        } else { 
            if (reversed.equals(check))
            {
                return true;
            } else {
                return false;
            }
        }
    }
}