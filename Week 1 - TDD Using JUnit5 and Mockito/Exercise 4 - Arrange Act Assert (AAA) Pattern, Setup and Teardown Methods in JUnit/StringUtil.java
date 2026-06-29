package javv;

public class StringUtil {

    public String reverse(String input) {

        if (input == null)
            return null;

        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {

        if (input == null)
            return false;

        return input.equalsIgnoreCase(reverse(input));
    }
    
    // Author - Anbu_Kumar G
    //Digital-nurture-5.0
}