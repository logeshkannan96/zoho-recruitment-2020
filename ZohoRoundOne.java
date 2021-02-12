import java.util.*;

public class ZohoRoundOne {
    public static void main(String[] args) {
        String inputString = "WELCOME";
        int lines = inputString.length();
        for(int i = 0; i < lines; i++) {
            int z = 0;
          for(int j = lines-1; j > i; j--) {
            System.out.print(" ");
          }
          for(int k = 0; k <= i; k++) {
            System.out.print(((lines/2)+k) < lines ? inputString.charAt(((lines)/2)+k) : inputString.charAt(z++));
          }
        System.out.println();
        }
    }
}
