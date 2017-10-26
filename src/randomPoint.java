import java.time.Year;

public class randomPoint {
    public static void main(String[] args) {
        final double radius = 40;

        //产生范围在0～2*PI的随机角度
        double alpha1 = Math.random() * Math.PI * 2;
        double alpha2 = Math.random() * Math.PI * 2;
        double alpha3 = Math.random() * Math.PI * 2;

        //计算三个角的坐标
        double x1 = radius * Math.cos(alpha1);
        double y1 = radius * Math.sin(alpha1);

        double x2 = radius * Math.cos(alpha2);
        double y2 = radius * Math.sin(alpha2);

        double x3 = radius * Math.cos(alpha3);
        double y3 = radius * Math.sin(alpha3);

        //计算三条边长
        double l1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2,2));
        double l2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3,2));
        double l3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1,2));

        //用反三角函数计算三个角
        double angle1 = Math.acos((Math.pow(l3,2) + Math.pow(l2,2) - Math.pow(l1,2)) / (2 * l2 * l3));
        double angle2 = Math.acos((Math.pow(l1,2) + Math.pow(l3,2) - Math.pow(l2,2)) / (2 * l1 * l3));
        double angle3 = Math.acos((Math.pow(l2,2) + Math.pow(l1,2) - Math.pow(l3,2)) / (2 * l2 * l1));

        System.out.printf("Three random angles are :\nalpha1 = %f\nalpha2 = %f\nalpha3 = %f\n", alpha1, alpha2, alpha3);
        System.out.println("Three coordinates are :" + "\n" + "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")");
        System.out.println("Three lines are :" + "\n" + "l1 = "  + l1 + "\n"+ "l2 = "  + l2  + "\n" + "l3 = "  + l3);
        System.out.println("The three angles of triangle are :");
        System.out.println("angle1 = " + Math.toDegrees(angle1) + "\n" + "angle2 = " + Math.toDegrees(angle2) + "\n" + "angle3 = " + Math.toDegrees(angle3) + "\n");
    }
}
