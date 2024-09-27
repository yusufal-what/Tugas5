
import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("Total pembelian Rp. = ");
        double totalPembelian = input.nextDouble();

       
        double potongan;

       
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;  // 5% discount
        } else {
            potongan = totalPembelian * 0.2;   // 20% discount
        }

        
        double totalBayar = totalPembelian - potongan;

        
        System.out.println("Besarnya potongan Rp. " + potongan + " (otomatis)");
        System.out.println("Jumlah yang harus dibayarkan Rp. " + totalBayar + " (otomatis)");

        input.close();
    }
}
