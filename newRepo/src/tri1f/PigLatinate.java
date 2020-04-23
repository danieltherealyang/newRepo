package newRepo.src.tri1f;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.*;
public class PigLatinate {
    static boolean noVowelCheck(String word)
    {
        if (
            !word.toLowerCase().contains("a".toLowerCase()) &&
            !word.toLowerCase().contains("e".toLowerCase()) &&
            !word.toLowerCase().contains("i".toLowerCase()) &&
            !word.toLowerCase().contains("o".toLowerCase()) &&
            !word.toLowerCase().contains("u".toLowerCase()))
        {
            return true;
        } else {
            return false;
        }
    }
        
    static boolean startVowelCheck(String word)
    {
        char firstChar = Character.toLowerCase(word.charAt(0));
        if (firstChar == 'a' ||
            firstChar == 'e' ||
            firstChar == 'i' ||
            firstChar == 'o' ||
            firstChar == 'u')
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
        
    static int firstVowelIndex(String word)
    {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        String lowercaseWord = word.toLowerCase();
        for (int i = 0; i < lowercaseWord.length(); i++)
        {
            for (int v = 0; v < vowels.length; v++)
            {
                if (lowercaseWord.charAt(i) == vowels[v])
                {
                    return i;
                }
            }
        }
        return -1;
    }
    
    static char punctIndex(String word)
    {
        for (int i = 0; i < word.length(); i++)
        {
            String character = Character.toString(word.charAt(i));
            if (Pattern.matches("\\p{Punct}", character))
            {
                return word.charAt(i);
            }
        }
        return '\u0000';
    }
    
    public String pLSentance(String englishSentence) {
        int i;
        String space = " ";
        String[] englishWord = englishSentence.split("\\s+");
        List<String> PigLatinArr = new ArrayList<String>();
        for (i = 0; i < englishWord.length; i++)
        {
            if (noVowelCheck(englishWord[i]))
            {
                String[] noPunct = englishWord[i].split("[\\p{Punct}\\s]+", 2);
                char Punct = punctIndex(englishWord[i]);
                String punct = Character.toString(Punct);
                String pigLatinWord = noPunct[0] + "ay" + punct;
                String element = pigLatinWord + space;
                PigLatinArr.add(element);
            } else if (startVowelCheck(englishWord[i])) {
                String[] noPunct = englishWord[i].split("[\\p{Punct}\\s]+", 2);
                char Punct = punctIndex(englishWord[i]);
                String punct = Character.toString(Punct);
                String pigLatinWord = noPunct[0] + "yay" + punct;
                String element = pigLatinWord + space;
                PigLatinArr.add(element);
            } else {
                String[] noPunct = englishWord[i].split("[\\p{Punct}\\s]+", 2);
                char Punct = punctIndex(englishWord[i]);
                String punct = Character.toString(Punct);
                char lowerFirstLetter = Character.toLowerCase(noPunct[0].charAt(0));
                String lowerCaseWord = Character.toString(lowerFirstLetter) + noPunct[0].substring(1);
                
                String start = lowerCaseWord.split("a|e|i|o|u", 2)[0];
                
                String noVowEnd = lowerCaseWord.split("a|e|i|o|u", 2)[1];
                int vowelIndex = firstVowelIndex(englishWord[i]);
                char firstVowel = noPunct[0].charAt(vowelIndex);
                String strVowel = Character.toString(firstVowel);
                
                String end = strVowel + noVowEnd;
                    
                    if (Character.isUpperCase(noPunct[0].charAt(0)))
                    {
                        char capital = Character.toUpperCase(end.charAt(0));
                        String capitalEnd = Character.toString(capital) + end.substring(1);
                        PigLatinArr.add(capitalEnd);
                    } else {
                        PigLatinArr.add(end);
                    }
                PigLatinArr.add(start + "ay" + punct + space);
            }
        }
        String PigLatin = String.join("",PigLatinArr);
        return PigLatin;
    }
}