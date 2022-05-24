public class Z10_1 {
    public static void main(String[] args) {
        double x = (double)4/7;
        System.out.printf("4/7 = %.5f\n", x);

        double y = (int)(x*100000+0.5)/100000.0;
        System.out.println("4/7 = " + y);
        //inna opcja
        System.out.println(String.format("4/7 = %.5f", x));
    }
}
