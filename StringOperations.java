public class StringOperations {
    public static void main(String[] args) {
        // String Declaration
        String str1 = "Hello";
        String str2 = "World";

        // 1. Concatenation
        String concatenatedStr = str1.concat(str2);
        System.out.println("Concatenated String: " + concatenatedStr);

        // 2. Length of a String
        int length = concatenatedStr.length();
        System.out.println("Length of String: " + length);

        // 3. Substring
        String substring = concatenatedStr.substring(2,7);
        System.out.println("Substring: " + substring);

        // 4. Uppercase
        String uppercase = concatenatedStr.toUpperCase();
        System.out.println("Uppercase String: " + uppercase);

        // 5. Replace
        String replacedStr = concatenatedStr.replace('o', 'x');
        System.out.println("String after replacement: " + replacedStr);

        //6. Lowercase
        String lowercase = concatenatedStr.toLowerCase();
        System.out.println("Lowercase String: " + lowercase);
    }
}

