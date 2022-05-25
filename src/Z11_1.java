import java.util.Scanner;

public class Z11_1 {
    //Konwerter temperatury ze stopni Celciusza na Fahranheita
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if(input.hasNextDouble() == true) {
            double tC = input.nextDouble();
            System.out.printf("%.1f\u00B0C = %.1f\u00B0F\n", tC, tC*1.8+32);
        }
        else System.out.println("dane podane w niepoprawnym formacie");
        input.close();
    }
}
