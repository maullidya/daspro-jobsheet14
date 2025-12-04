import java.util.Scanner;
public class tugasRekursif {
     static int totalRekursif(Scanner sc, int n) {
        if (n == 0) {
            return 0;  
        } else {
            System.out.print("Masukkan angka ke-" + n + ": ");
            int x = sc.nextInt();
            return x + totalRekursif(sc, n - 1); 
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();
        int hasilRekursif = totalRekursif(sc, n);
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + hasilRekursif);
    }
}
