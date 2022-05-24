import static java.lang.Math.*;

public class Z10_4 {
    public static void main(String[] args) {
        //moje rozwiązanie
        int liczba = 5;
        for (int i = 2; i <11; i++)
            System.out.println(String.format("%.6f",pow((double)liczba,(double)1/i)));
        //rozwiazanie z ksiazki
        int[] dane = {2,3,4,5,6,7,8,9,10};
        for (int i : dane){
            double x = pow(5, 1.0/i);
            System.out.printf("Pierwiastek %2d stopnia z 5: %f\n", i,x);
        }
    }
}
