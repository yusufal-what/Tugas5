
import java.util.Scanner;

public class BMIProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan (meter): ");
        double tinggiBadan = input.nextDouble();

        double bmi = beratBadan / (tinggiBadan * tinggiBadan);

        System.out.printf("IMT (Indeks Massa Tubuh) Anda: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Kriteria: Berat Badan Kurang");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Kriteria: Berat Badan Ideal");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Kriteria: Berat Badan Lebih");
        } else if (bmi >= 30 && bmi <= 39.9) {
            System.out.println("Kriteria: Gemuk");
        } else if (bmi >= 40) {
            System.out.println("Kriteria: Sangat Gemuk");
        }

        input.close();
    }
}
