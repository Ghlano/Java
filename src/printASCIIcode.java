import java.util.*;
public class printASCIIcode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter an ASCII code : ");
        int code = input.nextInt();
        char  ch = (char)code;
        System.out.println("The character for ASCII code " + code + " is "+ ch);

    }
}
