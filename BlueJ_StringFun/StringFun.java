/**
 * Fun With Strings
 *
 * @author Haoye
 * @version 1573843998
 */
public class StringFun
{
    // Your task is to successfully implement each method in this class. Work from the top of this class to the bottom.

    /**
     * Prints each letter of a given string (one per line).
     * @param myName A string to analyze
     */
    public static void printEachLetter(String myName)
    {
        for(int i=0; i<myName.length(); i++) {
            System.out.println(myName.charAt(i));
        }
    }


    /**
     * Determines if the given letter is a vowel.
     * @param ltr The letter to analyze
     * @return True if the letter is a vowel, false otherwise. Y will not be considered a vowel.
     */
    private static boolean isVowel(char ltr)
    {
        if (ltr == 'a' || ltr == 'e' || ltr == 'i' || ltr == 'o' || ltr == 'u' ||
            ltr == 'A' || ltr == 'E' || ltr == 'I' || ltr == 'O' || ltr == 'U' ) return true;
        return false;
    }

    /**
     * Prints only the vowels in a given string (one per line).
     * You must call your isVowel method in this method.
     * @param myName The string to analyze
     */
    public static void printVowels(String myName)
    {
        for(int i=0; i<myName.length(); i++) {
            if (isVowel(myName.charAt(i))) {
                System.out.println(myName.charAt(i));
            }
        }
    }

    /**
     * Returns a backwards copy of the original string.
     * @param original The original string to analyze
     * @return A backwards copy of the original string
     */
    public static String backwardsString (String original)
    {
        String backwards = "";
        for(int i=original.length(); i>0; i--) {
            backwards = backwards + original.charAt(i-1);
        }
        return backwards;
    }

    /**
     *  Returns true if the given String is a palindrome (reads the same
     *  forwards and backwards (example: "racecar"). This method should
     *  be case sensitive (e.g. "Racecar" is not a palindrome but "RacecaR" is).
     *  You should call your backwardsString method in this method.
     **/
    public static boolean isPalindrome(String myName)
    {
        if (myName.equals(backwardsString(myName))) return true;
        return false;
    }

    /**
     * Returns a copy of the given String with all the vowels removed. (NOTE: y is not considered a vowel)
     * You should call your isVowel method in this method.
     * @param s The original String to process
     * @return A copy of the given String with all the vowels removed. (NOTE: y is not considered a vowel)
     */
    public static String removeVowels(String s)
    {
        String noVowel = "";
        for(int i=0; i<s.length(); i++) {
            if (isVowel(s.charAt(i)) != true) {
                noVowel = noVowel + s.charAt(i);
            }
        }
        return noVowel;
    }
}
