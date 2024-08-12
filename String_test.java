public class String_test {
    
    public static void main(String[] args) {
        //Q1. Count the number of words in the String. String="This is a string";
/*
     String str ="This is a String";
     int count=0;
     for(int i=0;i<str.length();i++){
        char ch =str.charAt(i);
         if(ch==' '){
            count++;
         }
     }
     System.out.println(count+1);

*/

     //Q2 Replace all the occurences of string with java

/*
    String str = "This is a String";
     String [] strarray = str.split(" ");
     for(int i=0;i<strarray.length;i++){
        if (strarray[i].equalsIgnoreCase("String")){
            strarray[i]="java";
        }
        
     }
     System.out.println(strarray);
     String newstr=" ";
     for(int i=0;i<strarray.length;i++){
        newstr +=strarray[i]+" ";
     }
     System.out.println(newstr);
*/


//Q3. Remove all the spaces from the given String

/*
    String str ="This is a String";
    String new_str =" ";
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)!=' '){
         new_str+=str.charAt(i);
      }
   }
    str=new_str;
    System.out.println(str);
*/


//Q4. Determine the string is balanced or not


String str="(((()))";
int opening=0;
int closing=0;
for(int i=0;i<str.length();i++){
   if(str.charAt(i)=='('){
      opening++;
   }
   if(str.charAt(i)==')'){
      closing++;
   }
}
   if(opening==closing){
      System.out.println("string is balanced");
   }

   else
   {
      System.out.println("not Balanced");
   }

}
}