/**
 * Tester class to help grade student StringFun class.
 * 
 * @author (Doug Vermes) 
 * @version (11/15/2019)
 */
public class StringFunTester
{
    public static void main(String[] args)
    {
        System.out.println("Printing each letter in Sylvester... (each letter should be on a different line)");
        StringFun.printEachLetter("Sylvester");
        System.out.println("Printing vowels in facetious... (each letter should be on a different line)");
        StringFun.printVowels("facetious");
        System.out.println("Printing backwardsString of algebra: " + StringFun.backwardsString("algebra") + "\t(should be arbegla)");
        System.out.println("Printing backwardsString of atoyota: " + StringFun.backwardsString("atoyota") + "\t(should be atoyota)");
        System.out.println("isPalindrome(\"algebra\")==" + StringFun.isPalindrome("algebra") + "\t(should be false)");
        System.out.println("isPalindrome(\"atoyota\")==" + StringFun.isPalindrome("atoyota") + "\t(should be true)");
        System.out.println("isPalindrome(\"Racecar\")==" + StringFun.isPalindrome("Racecar") + "\t(should be false)");
        System.out.println("removeVowels(\"facetious\")==" + StringFun.removeVowels("facetious") + "\t(should be fcts)");
        System.out.println("removeVowels(\"fAcEtIOUs\")==" + StringFun.removeVowels("fAcEtIOUs") + "\t(should be fcts)");
    }
}
