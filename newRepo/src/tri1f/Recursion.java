package newRepo.src.tri1f;

public class Recursion {
    public boolean pCheck(String checkString) {
        String check = checkString.toLowerCase();
        check = check.replaceAll("[^a-zA-Z0-9]", ""); //remove nonalphanumeric
        check = check.replaceAll("\\s+",""); 
        if (check.length() == 1 || check.length() == 0) {
            return true;
        }
        
        char first = check.charAt(0);
        char last = check.charAt(check.length() - 1);
        if (first == last) {
            checkString = check.substring(1, check.length() - 1);
            return pCheck(checkString);
        }
        
        return false;
    }
}