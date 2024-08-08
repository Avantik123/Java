//1.	Write a Java program to get the character at the given index within the string.
import java.util.Scanner;

/*public class Ass_1 {
    public static void main(String[] args) {
        String str="Hello world";
        System.out.println("Enter the index of character you want");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0 && n<str.length()) {
            char ch= str.charAt(n);
        
        System.out.println("the character at the index " +n +" is " +ch);
        }
        else{
            System.out.println("array index out of bounds");
        }

    }
}*/

//2. Write a Java program to compare two strings lexicographically.
// Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
// String 1: This is Exercise 1                                                                                  
// String 2: This is Exercise 2                                                                                  
// "This is Exercise 1" is less than "This is Exercise 2" 

/*class Ass_1{
    public static void main(String[] args) {
        String str1="This is Excercise 1";
        String str2="This is Excercise 2";
        int count=0;
    if (str1.length()==str2.length()){
     for (int i=0; i<str1.length(); i++){
        if(str1.charAt(i)==str2.charAt(i)){
            count++;
        }
     }
    }
     if(count==str1.length()){
        System.out.println("true");
    } 
    else{
        System.out.println("false");
    }
    }
    }*/

// 3.	Write a Java program to compare two strings lexicographically, ignoring case differences.
// String 1: This is exercise 1                                                                                  
// String 2: This is Exercise 1                                                                                  
// "This is exercise 1" is equal to "This is Exercise 1"
/*class Ass_1{
    public static void main(String[] args) {
       String str1 = "This is excercise 1";
       String str2 = "This is Excercise 1";
    //int result= compareStrings(str1, str2);
    int result= str1.compareToIgnoreCase(str2);
    if(result>0){
        System.out.println(str1 +"is greater than "+ str2);
    } 
    else if (result<0) {
        System.out.println( str1 +"  is less than"+ str2 );
    } else {
        System.out.println( str1 +" equal "+ str2 );
    }
      }
}*/
// 4. Write a Java program to concatenate a given string to the end of another string.
// String 1: PHP Exercises and                                                                                   
// String 2: Python Exercises                                                                                    
// The concatenated string: PHP Exercises and Python Exercises
/*class Ass_1{
    public static void main(String[] args) {
        String str1="PHP Exercises";
        String str2="python Excercises";
        String concatinatestr=str1+" "+str2;
        System.out.println(concatinatestr);
    }
}*/
// 5.	Write a Java program to compare a given string to the specified character sequence.
// Sample Output:
// Comparing example.com and example.com: true                                                                   
// Comparing Example.com and example.com: false

/*public class Ass_1 {
    public static void main(String[] args) {
        // Define the strings and character sequences to compare
        String string1 = "example.com";
        String string2 = "example.com";
        String string3 = "Example.com";
        
        // Compare the strings
        boolean result1 = string1.equals(string2);
        boolean result2 = string1.equals(string3);
        
        // Print the results
        System.out.println("Comparing \"" + string1 + "\" and \"" + string2 + "\": " + result1);
        System.out.println("Comparing \"" + string1 + "\" and \"" + string3 + "\": " + result2);
    }
}*/

