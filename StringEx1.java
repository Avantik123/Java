import java.util.Scanner;
public class StringEx1 {
    public static void main(String[] args) {
      String txt = "This is Programiz";
      boolean result;

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter String to search");
      String str1 = sc.next();

      result = txt.toLowerCase().contains(str1.toLowerCase());
      if(result) {
        System.out.println(str1 + " is present in the string.");
      }
      else {
        System.out.println(str1 + " is not present in the string.");
      }
    }
}
