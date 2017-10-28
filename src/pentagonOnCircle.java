import java.util.*;
public class pentagonOnCircle {
    public static void main(String[] args) {
        final double radian = Math.toRadians(72);
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the radius of the bounding circle : ");
        float radius = input.nextFloat();

        double alpha = Math.random() * Math.PI;

        double y1 = radius * Math.sin(alpha);
        double x1 = radius * Math.cos(alpha);

        double y2 = radius * Math.sin(alpha + radian);
        double x2 = radius * Math.cos(alpha + radian);

        double y3 = radius * Math.sin(alpha + 2 * radian);
        double x3 = radius * Math.cos(alpha + 2 * radian);

        double y4 = radius * Math.sin(alpha + 3 * radian);
        double x4 = radius * Math.cos(alpha + 3 * radian);

        double y5 = radius * Math.sin(alpha + 4 * radian);
        double x5 = radius * Math.cos(alpha + 4 * radian);

        System.out.println("(" + x1 + "," + y1 + ")");
        System.out.println("(" + x2 + "," + y2 + ")");
        System.out.println("(" + x3 + "," + y3 + ")");
        System.out.println("(" + x4 + "," + y4 + ")");
        System.out.println("(" + x5 + "," + y5 + ")");



    }

}
