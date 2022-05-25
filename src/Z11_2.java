import java.util.Scanner;

public class Z11_2 {
    public static void main(String[] args) {
        //Konwerter temperatury ze stopni Fahranheita na Celciusza
        Scanner input = new Scanner(System.in);
        if(input.hasNextDouble()==true){
            double tF = input.nextDouble();
            System.out.printf("%.1f\u00B0F = %.1f\u00B0C\n",tF, (tF-32)/1.8);
        }
        else System.out.println("dane podane w niepoprawnym formacie");
        input.close();
    }
}
