package exercise2;

class Arrays {
    //Take the arrays.js file, and refactor the code into Java in this file.
    public static void main(String[] args) {
        int[] nums = new int[]{10, 23, 3, 4, 5, 2, 1};
        System.out.println("The integer array is: " + java.util.Arrays.toString(nums));
        String[] greetings = new String[]{"hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا"};
        System.out.println("The String array is: " + java.util.Arrays.toString(greetings));
        int[] binaries = new int[]{0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0};
        System.out.println("The binary array is: " + java.util.Arrays.toString(binaries));
    }
}

//    void printNums() {};
//    void printGreetings() {};
//    void printBinaries() {};
