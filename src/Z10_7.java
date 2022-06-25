public class Z10_7 {
    //zamian stopni na radiany
    public static void main(String[] args) {
        double stopien = 36.0;
        double min_katowa = stopien/60;
        double sek_katowa = stopien/3600;
        double st_rad = Math.toRadians(stopien);
        double min_rad = Math.toRadians(min_katowa);
        double sek_rad = Math.toRadians(sek_katowa);
        System.out.printf("%.2f\u00B0 = %.15f rad\n", stopien, st_rad);
        System.out.printf("%.2f\' = %.15f rad\n", stopien, min_rad);
        System.out.printf("%.2f\" = %.15f rad\n", stopien, sek_rad);
        /*String dir = System.getProperty("user.dir");
        System.out.println();
        System.out.println(dir);*/
    }
}
