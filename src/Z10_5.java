public class Z10_5 {
    public static void main(String[] args) {
        //moja propozycja
        //asci od 65 do 90
        char[] litery = new char[26];
        for(int i = 65; i <91; i++) litery[i-65] = (char)i;
        System.out.println("Alfabet");
        System.out.println();
        System.out.println(String.format("Char%10s%10s%10s", "OCT","DEC","HEX"));
        //
        //System.out.format("[%2$s] [%1$s] [%1$s]", "pierwszy argument", "drugi argument");
        //
        //Po uruchomieniu tego kodu na konsoli zostanie wyświetlony napis:
        //
        //[drugi argument] [pierwszy argument] [pierwszy argument]
        //
        //Argument z numerem 1 użyty jest dwa razy,
        //argument 2. użyty jest jako pierwszy w łańcuchu formatującym.
        //
        for(char c: litery) System.out.println(String.format("%1$3c %2$10o%2$10d%2$10X",c,(int)c));
        System.out.println();
        //z książki
        System.out.printf("Znak%10s%10s%10s\n", "OCT", "DEC", "HEX");
        char[] znaki = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for(char z : znaki) {
            System.out.printf("%1$3c %2$10o%2$10d%2$10X\n", z, (int) z);
        }
    }
}

