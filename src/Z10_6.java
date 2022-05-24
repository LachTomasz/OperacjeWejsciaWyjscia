public class Z10_6 {
    //Zamiana miary kątowej w radianach na stopnie
    public static void main(String[] args) {
        int rad = 1;
        int kat = 1;
        double alfa = Math.toDegrees(rad);
        double radian = Math.toRadians(kat);
        System.out.println(rad+" rad = "+alfa+"\u00B0");
        System.out.println("1 stopien to "+radian);
        int stopien, min, sek;
        stopien = (int)alfa; //tym rzutowaniem odcinamy to co po przecinku w alfie
        min = (int)((alfa-stopien)*60+0.5);//reszte przemnazam 60 i dodaje 0.5 do zaokraglen
        System.out.printf("1 rad = %d\u00B0%d\'\n", stopien, min);
        min = (int)((alfa-stopien)*60);
        sek = (int)((alfa-stopien-min/60.0)*3600+0.5);
        System.out.printf("1 rad =  %d\u00B0%02d\'%02d\"\n", stopien, min, sek);
    }
}
