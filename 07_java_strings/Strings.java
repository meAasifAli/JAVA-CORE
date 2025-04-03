
public class Strings {

    public static void main(String[] args) {
        String greeting = "Hello World! ";
        System.out.println(greeting);

        //length of a string
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase()); // converts all chars in uppercase
        System.out.println(greeting.toLowerCase()); // converts all chars in lowercase
        System.out.println(greeting.trim()); // removes leading and trailing spaces
        System.out.println(greeting.charAt(4)); // returns the char at the specified index
        System.out.println(greeting.replace('!', '?')); // replaces old char with new char
        System.out.println(greeting.substring(0, 3)); // returns a substring from the start  to the end indexes
        System.out.println(greeting.startsWith("He")); // checks if the string starts with the specified prefix
        System.out.println(greeting.endsWith("ld! ")); // checks if the string ends with the specified suffix
        System.out.println(greeting.indexOf("o")); // returns the index of the first occurrence of the specified char
        System.out.println(greeting.lastIndexOf("o")); // returns the index of the last occurrence of the specified char
        System.out.println(greeting.equals("Hello World! ")); // checks if the string is equal to the specified string
        System.out.println(greeting.contains("Hello")); // checks if the string contains the specified sequence of char values
        System.out.println(greeting.compareTo("Hello")); // compares two strings lexicographically
        System.out.println(greeting.concat(" How are you?")); // concatenates the specified string to the end of this string
        System.out.println(greeting.isEmpty()); // checks if the string is empty
        System.out.println(greeting.isBlank()); // checks if the string is blank

    }
}
