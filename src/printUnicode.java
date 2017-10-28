import java.util.*;
public class printUnicode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter an character : ");
        String str = input.next();
        char ch = str.toCharArray()[0];
        int code = ch;


        System.out.println("The Unicode for the character " + str + " is " + code);
    }
}
