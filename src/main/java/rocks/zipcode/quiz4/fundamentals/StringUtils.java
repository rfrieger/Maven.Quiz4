package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int index = str.length()/2;
        str = str.substring(0,index) + str.substring(index).toUpperCase() + str.substring(index +1);

        return str;
    }

    public static String lowerCaseMiddleCharacter(String str) {

        int index = str.length()/2;
        str = str.substring(0,index) + str.substring(index).toLowerCase() + str.substring(index +1);

        return str;
    }

    public static Boolean isIsogram(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();


        for (int i = 0; i <str.length() ; i++) {
            set.add(str.charAt(i));
        }
        if (str.length() == set.size()){
            return true;
        }
        else return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i <str.length()-1 ; i++) {
            if (str.charAt(i) == str.charAt(i+1))
                return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i <sb.length()-1 ; i++) {
            if (sb.charAt(i) == sb.charAt(i+1)) {
                sb.deleteCharAt(i+1);
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }

    public static String invertCasing(String str) {
        return null;
    }
}