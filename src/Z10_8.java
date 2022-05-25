public class Z10_8 {
    public static void main(String[] args) {
        double bokA = 3.0, bokB = 4.0, bokC = 5.0;
        double katAC = Math.asin(bokA/bokC);
        double katBC = Math.acos(bokA/bokC);
        System.out.printf("Kat AC = %.4f rad\nKat BC = %.4f rad\n", katAC, katBC);

        System.out.println();
        katAC = Math.toDegrees(katAC);
        katBC = Math.toDegrees(katBC);
        System.out.printf("Kat AC = %.1f\u00B0\nKat BC = %.1f\u00B0\n", katAC, katBC);

        System.out.println();
        int st = (int)katAC;
        int min = (int)((katAC-st)*60+0.5);
        System.out.printf("Kat AC = %d\u00B0%02d\'\n", st, min);
        st = (int)katBC;
        min = (int)((katBC-st)*60.0+0.5);
        System.out.printf("Kat BC = %d\u00B0%02d\'\n", st, min);

        System.out.println();
        st = (int)katAC;
        min = (int)((katAC-st)*60);
        int sek = (int)((katAC-st-min/60.0)*3600+0.5);
        System.out.printf("katAC = %d\u00B0%02d\'%02d\"\n",st, min, sek);
        st = (int)katBC;
        min = (int)((katBC-st)*60);
        sek = (int)((katBC-st-min/60.0)*3600+0.5);
        System.out.printf("Kat BC = %d\u00B0%02d\'%02d\"\n", st, min, sek);
    }
}
