import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int i = 0;
        int los;
        int odp;

        Random rnd = new Random();

        los = rnd.nextInt(10 ) +1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadnij liczbę od 1 do 10");

        do{
            i++;
            System.out.println("Podaj liczbę: ");
            odp = scanner.nextInt();

            if ( odp > los){
                System.out.println("Twoja lczba jest za duża");
            } else if (odp < los) {
                System.out.println("Twoja liczba jest za mała");
            }


        }while (odp != los);
        System.out.println("Brawo, zgdłeś liczbę" + los + "Za " + i + " razem");



    }
}
