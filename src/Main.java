import java.util.Scanner;

/**
 * @author Muhammad Abdan Fikri
 */
public class Main {

    /**
     * @param angka angka yang ingin di faktorialkan
     * @return hasil dari faktorial
     */
    public static int Faktorial(int angka) {
        if (angka == 1 || angka == 0)
            return 1;
        else
            return angka * Faktorial(angka - 1);
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        int angka = scanner.nextInt();

        System.out.println("nilai faktorial : " + Faktorial(angka));



    }
}