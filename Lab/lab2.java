// “We realizes that while our workers were thriving, the
// surrounding villages were still suffering. It became our goal to uplift their
// quality of life as well. I remember seeing a family of 4 on a motorbike in the
// heavy Bombay rain — I knew I wanted to do more for these families who were
// risking their lives for lack of an alternative” The alternative mentioned here
// is the Tata Nano, which soon after came as the world’s cheapest car on retail
// at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a
// recent post by Humans of Bombay which formed the basis of his decision to come
// up with a car like Tata Nano.

// Write a Java Program to implement the following methods from String  with the above text.

// Java String Methods
// String charAt()
// String compareTo()
// String concat()
// String contains()
// String endsWith()
// String equals()
// equalsIgnoreCase()
// String format()
// String getBytes()
// String getChars()
// String indexOf()
// String intern()
// String isEmpty()
// String join()
// String lastIndexOf()
// String length()
// String replace()
// String replaceAll()
// String split()
// String startsWith()
// String substring()
// String toCharArray()
// String toLowerCase()
// String toUpperCase()
// String trim()
// String valueOf()

package Lab;


public class lab2 {

    public static void main(String[] args) 
    {
        String text ="We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative” The alternative mentioned here is the Tata Nano, which soon after came as the worlds cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano";

        // Using various String methods

        // returns a character at a specific index position in a string.
        char characterAtIndex10 = text.charAt(10);
        System.out.println("Character at index 10: " + characterAtIndex10);
        
        System.out.println();


        // returns a positive number (difference of character value)
        String anotherString = "Comparison string";
        int compareResult = text.compareTo(anotherString);
        System.out.println("Compare to 'Comparison string': " + compareResult);

        System.out.println();

        // returns a combined string like appending another string.
        String concatString = text.concat(". Additional text appended.");
        System.out.println("Concatenated String: " + concatString);

        System.out.println();

        // returns true if the sequence of char values is found in this string otherwise returns false.
        boolean containsBombay = text.contains("Bombay");
        System.out.println("Contains 'Bombay': " + containsBombay);

        System.out.println();

        // returns true if string ends with the given suffix; else returns false.
        boolean endsWithNano = text.endsWith("Nano");
        System.out.println("Ends with 'Nano': " + endsWithNano);


        System.out.println();

        // returns true if all characters are equal else retrun false
        String anotherText = "Different text";
        boolean isEqual = text.equals(anotherText);
        System.out.println("Is equal to 'Different text': " + isEqual);

        System.out.println();

        // If any character is not matched, it returns false, else returns true.
        String upperCaseText = "WE REALIZES THAT WHILE OUR WORKERS WERE THRIVING...";
        boolean isEqualIgnoreCase = text.equalsIgnoreCase(upperCaseText);
        System.out.println("Is equal ignoring case: " + isEqualIgnoreCase);



        System.out.println();

        // format()
        String formattedString = String.format("Formatted: %s", text);
        System.out.println(formattedString);


        System.out.println();

        // getBytes()
        byte[] textBytes = text.getBytes();
        System.out.println("String as bytes: " + textBytes.length);

        System.out.println();

        // getChars()
        char[] charArray = new char[20];
        text.getChars(5, 25, charArray, 0);
        System.out.println("Chars from index 5 to 25: " + new String(charArray));


        System.out.println();

        // indexOf()
        int indexOfTata = text.indexOf("Tata");
        System.out.println("Index of 'Tata': " + indexOfTata);


        System.out.println();

        // intern()
        String internedText = text.intern();
        System.out.println("Interned String: " + internedText);


        System.out.println();

        // isEmpty()
        boolean empty = text.isEmpty();
        System.out.println("Is empty: " + empty);


        System.out.println();

        // join()
        String joinedString = String.join("-", "Part1", "Part2", "Part3");
        System.out.println("Joined String: " + joinedString);


        System.out.println();

        // lastIndexOf()
        int lastIndexTata = text.lastIndexOf("Tata");
        System.out.println("Last index of 'Tata': " + lastIndexTata);


        System.out.println();

        // length()
        int textLength = text.length();
        System.out.println("Length of the string: " + textLength);


        System.out.println();

        // replace()
        String replacedString = text.replace("Nano", "Tata Nano");
        System.out.println("Replaced 'Nano' with 'Tata Nano': " + replacedString);



        System.out.println();

        // replaceAll()
        String replacedAllString = text.replaceAll("Tata", "New Tata");
        System.out.println("Replaced all 'Tata' with 'New Tata': " + replacedAllString);



        System.out.println();

        // split()
        String[] parts = text.split(" ");
        System.out.println("Splitting the text into parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        System.out.println();


        // startsWith()
        boolean startsWithWe = text.startsWith("We");
        System.out.println("Starts with 'We': " + startsWithWe);


        System.out.println();

        // substring()
        String subString = text.substring(20, 40);
        System.out.println("Substring from index 20 to 40: " + subString);



        System.out.println();

        // toCharArray()
        char[] charArrayFromString = text.toCharArray();
        System.out.println("Converted to char array: " + new String(charArrayFromString));



        System.out.println();

        // toLowerCase()
        String lowerCaseText = text.toLowerCase();
        System.out.println("Lowercase text: " + lowerCaseText);


        System.out.println();

        // toUpperCase()
        String upperCaseText2 = text.toUpperCase();
        System.out.println("Uppercase text: " + upperCaseText2);



        System.out.println();

        // trim()
        String trimmedText = text.trim();
        System.out.println("Trimmed text: " + trimmedText);


        System.out.println();

        // valueOf()
        int value = 100;
        String valueAsString = String.valueOf(value);
        System.out.println("Value of '100' as string: " + valueAsString);

        System.out.println();
    }
}
