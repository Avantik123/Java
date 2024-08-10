public class String_str2 {
    public static void main(String[] args) {
     // 6.  Replace "a" with "o" in the string "banana".
    
    /* 
       String str ="banana";
       str=str.replace("a","o");
       System.out.println(str);
    */



    //7. Convert the string "HELLO" to lowercase

   /*
       String str="HELLO";
       System.out.println(str.toLowerCase());
   */



   //8. Convert the string "world" to uppercase.

   /*
       String str ="world";
       System.out.println(str.toUpperCase());
   */



   //9. Remove the leading whitespace from the string " Hello"
 
   /*
        String str = " Hello";
        System.out.println(str.trim());
   */



   //10.Remove the trailing whitespace from the string "World "


   String str="world ";
   //str=str.trim();
   str=str.replaceAll("//s", " ");
   System.out.println("'"+str+"'");


    }
}