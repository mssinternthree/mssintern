import java.util.Scanner;
 public class firstUpr {
 public static void main(String[] args) {
 String upper_case_line = "";
     String str = "yo yo honey singh";
     Scanner s = new Scanner(str);
     while(s.hasNext()) {
        String word = s.next();
        upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
     }
     System.out.println(upper_case_line);
  }
}
