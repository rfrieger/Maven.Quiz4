package rocks.zipcode.quiz4.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] returnArr = new String[values.length -1];

        int mid =values.length/2;
        /// the, quick, brown
        for (int i = 0; i < mid ; i++) {
            returnArr[i] = values[i];
        }

        for (int i = mid ; i < values.length-1 ; i++) {
            returnArr[i] = values[i+1];
        }
return returnArr;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] returnArr = new String[values.length -1];

        for (int i = 0; i <values.length-1 ; i++) {
            returnArr[i] = values[i];

        }
        return returnArr;
    }
}