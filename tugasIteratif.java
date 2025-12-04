import java.util.Scanner;

public class tugasIteratif {
     static int totalIteratif(Scanner sc, int n) {
        int total = 0;
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int x = sc.nextInt();
            total += x;
        }
        return total;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();
        int hasilIteratif = totalIteratif(sc, n);
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + hasilIteratif);
    }
}
