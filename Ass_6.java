// 6.	 Write a Java program to compare a given string to a specified string buffer.
// Sample Output:
// Comparing example.com and example.com: true                                                                   
// Comparing Example.com and example.com: false 

//
// 7.	Write a Java program to check whether two String objects contain the same data.
// Sample Output:
// "" equalStephen Edwin Kings "Walter Winchell"? false                                                          
// "Stephen Edwin King" equals "Mike Royko"? false
/*class Ass_6{
    public static void main(String[] args) {
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "Mike Royko";

        boolean result1=(str1.equals(str2));
        boolean result2=(str1.equals(str3));
        System.out.println(str1 +" equals " +str2 +" : " +result1);
        System.out.println(str1 +" equals " +str3 +" : " +result2);

    }
}*/
// 8.	Write a Java program to replace a specified character with another character.
// Sample Output:
// Original string: The quick brown fox jumps over the lazy dog.                                                 
// New String: The quick brown fox jumps over the lazy fog.
/**
 * Ass_6
 */
/*public class Aas_6 {
    public static void main(String[] args) {
        String original="The quick brown fox jumps over the lazy dog.";
        char oldch='d';
        char newch='f';
        String newstr=(original.replace(oldch, newch));
        System.out.println("Original string: " + original);
        System.out.println("New string: " + newstr);

    }
}*/

// 9.	Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
// Sample string : "The quick brown fox jumps over the lazy dog."
// In the above string replace all the fox with cat.
// Sample Output:
// Original string: The quick brown fox jumps over the lazy dog.                                                 
// New String: The quick brown cat jumps over the lazy dog.       

/*public class Ass_6 {
    public static void main(String[] args) {
        String original="The quick brown fox jumps over the lazy dog.";
        String oldstr="fox";
        String newstr="cat";
        String newstring=(original.replace(oldstr, newstr));
        System.out.println("Original string: " + original);
        System.out.println("New string: " + newstring);

    }
}*/
// 10.	Write a Java program to convert all characters in a string to lowercase.
// Sample Output:
// Original String: The Quick BroWn FoX!                                                                         
// string in lowercase: the quick brown fox!
class Ass_6{
    public static void main(String[] args) {
        String original ="The Quick BroWn FoX!"; 
        String lowercaseString = original.toLowerCase();
        
        System.out.println("String in lowercase: " + lowercaseString);
    
    }
}