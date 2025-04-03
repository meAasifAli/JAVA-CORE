# Strings


Strings are used for storing text.
A String variable contains a collection of characters surrounded by double quotes

`example`:

```java
String greeting = "Hello";
```

# String Length

 The length of a string can be found with the length() method

 ```java
 String greeting = "Hello";
 System.out.println(greeting.length());
 ```
### String methods

- `toUpperCase()`: Converts a string to upper case letters
- `toLowerCase()`: Converts a string to lower case letters
- `trim()`: Removes extra spaces
- `charAt(int index)`: Returns the character at the specified index (position)
- `replace(char oldChar, char newChar)`: Replaces oldChar with newChar
- `substring(int beginIndex, int endIndex)`: Returns a new string that is a substring of this string.
- `startsWith(String prefix)`: Checks if the string starts with the given prefix.
- `endsWith(String suffix)`: Checks if the string ends with the given suffix.
- `contains(CharSequence s)`: Checks if the string contains the given sequence of characters.
- `indexOf(String str)`: Returns the index of the first occurrence of the specified substring.
- `lastIndexOf(String str)`: Returns the index of the last occurrence of the specified substring.
- `equals(Object anObject)`: Compares this string to the specified object.
- `equalsIgnoreCase(String anotherString)`: Compares this string to another string, ignoring case considerations.
- `compareTo(String anotherString)`: Compares two strings lexicographically.
- `compareToIgnoreCase(String str)`: Compares two strings lexicographically, ignoring case differences.
- `concat(String str)`: Concatenates the specified string to the end of this string.
- `intern()`: Returns a canonical representation for the string object.
- `isEmpty()`: Checks if the string is empty.
- `toCharArray()`: Converts this string to a new character array.
- `getBytes()`: Encodes this string into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
- `getBytes(String charsetName)`: Encodes this string into a sequence of bytes using the named charset, storing the result into a new byte array.
- `format(String format, Object... args)`: Returns a formatted string using the specified format string and arguments.
- `join(CharSequence delimiter, CharSequence... elements)`: Joins the elements of the given array into a single string, using the specified delimiter.

### String methods implementation in Java

```java
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
```

### special characters in Java

```java
String txt = "We are the so-called "Vikings" from the north.";
```
Java will misunderstand this string, and generate an error
The solution to avoid this problem, is to use the backslash escape character.

```java
String txt = "We are the so-called \"Vikings\" from the north.";
```

### escape characters

- `\n`: New line
- `\r`: Carriage return
- `\t`: Tab
- `\b`: Backspace
- `\f`: Form feed
- `\"`: Double quote
- `\'`: Single quote
- `\\`: Backslash