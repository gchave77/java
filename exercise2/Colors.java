package exercise2;

import java.util.Arrays;

public class Colors {

    String[] colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.)
        // return an array of strings that start with a color.
        // discard all the other strings.  If no strings start with a color in the input array, return an empty array.
        int i=0;
        String[] colors = {"red", "yellow", "green", "bluebird", "black", "pink"};
        String[] colorArray = new String[7];
        for (String colorMatch : strings) {
            String[] wordArray = colorMatch.split(" ");
            for (String subString : wordArray) {
                if (Arrays.asList(colors).contains(subString)) {
                    colorArray[i] = colorMatch;
                    i += 1;
                    System.out.println(colorMatch + ", begins with a color");
                }
            }
        }
        System.out.println("This is the new array: " + Arrays.toString(colorArray));
        return colorArray;
//        return new String[]{};
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink",
                "great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
        System.out.println("This is the Colors class");
    }
}
