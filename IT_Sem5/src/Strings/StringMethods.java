package Strings;

public class StringMethods {

    public static void main(String[] args) {
        //creating Strings using Literals:
        String s1 = "Java Program";
        String s2 = "Java Program";

        //checking the address of s1 & s2
       /* if (s1 == s2) {
            System.out.println("Strings s1 & s2 point to same references");
        } else {
            System.out.println("Strings s1 & s2 point to different references");
        }

        //creating STrings using new keyword:
        String S1 = new String("Programming in Java");
        String S2 = new String("Programming in Java");

        //checking the address of s1 & s2
        if (S1 == S2) {
            System.out.println("Strings S1 & S2 point to same references");
        } else {
            System.out.println("Strings S1 & S2 point to different references");
        }

        //STING METHODS:
        //charAt(int index):returns the character at the given index
        String S = new String("Programming in Java");
        System.out.println(S.charAt(6));*/

        /*STRING COMPARISON: we can compare 2 strings on the basis of contents & reference
        used in authentication: equals()
        sorting: compareTo()
            compares the given string with current string lexicographically. characters
            It returns positive number, negative number or 0.
            If first string is lexicographically greater than second string, 
            it returns positive number (difference of character value).
            If first string is less than second string lexicographically, it returns negative number and 
            if first string is lexicographically equal to second string, it returns 0.
        reference: Comparision Operator ( = =)*/
        String a = "hello";
        String b = "hello";
        String c = "meklo";
        String d = "hemlo";
        String e = "flag";
        System.out.println(a.compareTo(b));//0 because both are equal  
        System.out.println(a.compareTo(c));//-5 because "h" is 5 times lower than "m"  
        System.out.println(a.compareTo(d));//-1 because "l" is 1 times lower than "m"  
        System.out.println(a.compareTo(e));//2 because "h" is 2 times greater than "f"

        //equals(): returns a boolean values
        //String f = "javatpoint is a good website";
        /*String g = "javatpoint";
        String h = "JAVAtPOINT";
        String i = "python";
        System.out.println(f.equals(g));//true because content and case is same  
        System.out.println(f.equals(h));//false because case is not same  
        System.out.println(f.equals(i));//false because content is not same */

        //length(): returns count of total number of characters.
        //System.out.println("Length of String \"" + s1 + " \"is: " + s1.length());
        //System.out.println("Length of String \"" + S1 + " \"is: " + S1.length());

        //toLowerCase(): converts all characters of the string into lower case letter.
        //if any lowercase no conversion
         //System.out.println(h.toLowerCase());

        //toUpperCase(): converts all characters of the string into upper case letter.
        //if any uppercase no conversion
        //System.out.println(f.toUpperCase());

        /*substring(): returns a part of the string.
        We pass begin index and end index number position to the method
        where start index is inclusive and end index is exclusive.*/
       /*String f = "javatpoint";
       System.out.println(f.substring(2, 4));//returns va  
        System.out.println(f.substring(2));//returns vatpoint  

        /*replace(): returns a string replacing all the old char with new char. */
        String j = "javatpoint is a very good website";
        //replaces all occurrences of 'a' to 'e' 
         System.out.println(j.replace('a', 'e'));

        /*replaceAll():returns a string replacing all the sequence of characters matching regexp
        and replacement string. */
        String k = "My name is Khan. My name is Bob. My name is Sonoo.";
        //replaces all occurrences of "is" to "was"
        System.out.println(k.replaceAll("is", "was"));

        /*isEmpty():checks if this string is empty or not.
        It returns true, if length of string is 0 otherwise false.
        In other words, true is returned if string is empty
        otherwise it returns false.*/
        /*String l = "";
        String m = "javatpoint";

        System.out.println(l.isEmpty());
        System.out.println(m.isEmpty());*/

        /*valueOf():converts different types of values into string.
        By the help of string valueOf() method, you can convert int to string,
        long to string, boolean to string, character to string, float to string,
        double to string, object to string and char array to string. */
        /*int value = 30;
        String n = String.valueOf(value);
        System.out.println(n + 10);//concatenating string with 10  */
    }

}
