package pack1;

public class string_operations {

	    public static void main(String[] args) {
	        // Sample strings
	        String str1 = "Hello";
	        String str2 = "World";
	        String str3 = "  Hello World!  ";
System.out.println();
	        // 1. Concatenation
	        String concatenated = str1 + " " + str2; // or str1.concat(str2);
	        System.out.println("Concatenated: " + concatenated);
	        System.out.println();
	        // 2. Length
	        int length = concatenated.length();
	        System.out.println("Length: " + length);
	        System.out.println();
	        // 3. Character at a specific index
	        char charAt = concatenated.charAt(1);
	        System.out.println("Character at index 1: " + charAt);
	        System.out.println();
	        // 4. Substring
	        String substring = concatenated.substring(6); // from index 6 to end
	        System.out.println("Substring from index 6: " + substring);
	        System.out.println();
	        String substring2 = concatenated.substring(0, 5); // from index 0 to 5
	        System.out.println("Substring from index 0 to 5: " + substring2);
	        System.out.println();
	        // 5. Replace
	        String replaced = concatenated.replace("World", "Java");
	        System.out.println("Replaced 'World' with 'Java': " + replaced);
	        System.out.println();
	        // 6. Uppercase and Lowercase
	        String upper = concatenated.toUpperCase();
	        String lower = concatenated.toLowerCase();
	        System.out.println("Uppercase: " + upper);
	        System.out.println("Lowercase: " + lower);
	        System.out.println();
	        // 7. Trim (removing leading and trailing whitespace)
	        String trimmed = str3.trim();
	        System.out.println("Trimmed: '" + trimmed + "'");
	        System.out.println();
	        // 8. Split
	        String[] splitArray = concatenated.split(" ");
	        System.out.println("Split by space: ");
	        for (String word : splitArray) {
	            System.out.println(word);
	        }
	        System.out.println();
	        // 9. Contains
	        boolean contains = concatenated.contains("Hello");
	        System.out.println("Contains 'Hello': " + contains);
	        System.out.println();
	        // 10. StartsWith and EndsWith
	        boolean startsWith = concatenated.startsWith("Hello");
	        boolean endsWith = concatenated.endsWith("World");
	        System.out.println("Starts with 'Hello': " + startsWith);
	        System.out.println("Ends with 'World': " + endsWith);
	        System.out.println();
	        // 11. IndexOf and LastIndexOf
	        int indexOf = concatenated.indexOf("o");
	        int lastIndexOf = concatenated.lastIndexOf("o");
	        System.out.println("Index of 'o': " + indexOf);
	        System.out.println("Last index of 'o': " + lastIndexOf);
	        System.out.println();
	        // 12. Equals and EqualsIgnoreCase
	        boolean equals = str1.equals(str2);
	        boolean equalsIgnoreCase = str1.equalsIgnoreCase("HELLO");
	        System.out.println("Equals: " + equals);
	        System.out.println("Equals ignoring case: " + equalsIgnoreCase);
	        System.out.println();
	        // 13. CompareTo and CompareToIgnoreCase
	        int compareTo = str1.compareTo(str2);
	        int compareToIgnoreCase = str1.compareToIgnoreCase("hello");
	        System.out.println("CompareTo: " + compareTo);
	        System.out.println("CompareTo ignoring case: " + compareToIgnoreCase);
	        System.out.println();
	        // 14. ValueOf (converting other types to string)
	        int number = 100;
	        String numberStr = String.valueOf(number);
	        System.out.println("String value of number: " + numberStr);
	        System.out.println();
	        // 15. IsEmpty
	        boolean isEmpty = str1.isEmpty();
	        System.out.println("Is empty: " + isEmpty);
	        System.out.println();
	        // 16. Join (Java 8+)
	        String joined = String.join(", ", "Java", "Python", "C++");
	        System.out.println("Joined: " + joined);
	    }
	}

