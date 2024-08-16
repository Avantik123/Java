public class String_str4 {
    public static void main(String[] args) {
        //17. Count the number of vowels in the string "Education".
 /*
        String str="Education";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u'){
            count++;
        }
    }
        System.out.println("No of vowels in a String is:"+count);
*/


        //18. Reverse the string "Palindrome"
/*
        String str ="Palindrome";
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i)+" ");
        }
*/


         //19. Check if the string "racecar" is a palindrome.
/*
         String str = "raceecar";
         String rev =" ";
         for(int i=str.length()-1;i>=0;i--){
         rev += str.charAt(i);
         }
         if(str.equals(rev)){
            System.out.println("Palindrome");
         }
         else{
            System.out.println("not palindrome");
         }
*/

        //20. 20. Repeat the string "Ha" three times.

        String str ="Ha";
        for(int i=0;i<=2;i++){
            System.out.println(str);
        }





    }
}
