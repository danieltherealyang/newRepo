package newRepo.src.tri1f;

public class IJ {
    public boolean pCheck(String checkString) {
        String check = checkString.toLowerCase();
        check = check.replaceAll("[^a-zA-Z0-9]", ""); //remove nonalphanumeric
        check = check.replaceAll("\\s+",""); 
        if (check.length() == 1 || check.length() == 0) {
            return true;
        }
        
        int i;
        for (i = 0; i < check.length(); i++) {
            int j = check.length() - 1 - i;
            if (check.charAt(i) != check.charAt(j)) {
                return false;
            } 
        }
        return true;
    }
}