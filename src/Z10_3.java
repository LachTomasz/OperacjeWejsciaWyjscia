//Dzięki importowi tej klasy później moge tylko pisać wywołanie metod z ppominięciem klasy
// np. sqrt zamiast Math.sqrt
import static java.lang.Math.*;

public class Z10_3 {
    public static void main(String[] args) {
        int[] liczby = {2, 3, 5, 7, 11, 13, 17};

        for(int i : liczby)
            System.out.println(String.format("%3d %15.8f %15.8f", i, sqrt(i), cbrt(i)));
        //%3d - wyswietla na polu szerokości 3 znaków liczbę całkowitą
        //%15.8f - na polu o szerokości 15 znaków liczbę zmiennoprzecinkową
        // z dokładnością do 8 miejsc po przecinku
    }
}
