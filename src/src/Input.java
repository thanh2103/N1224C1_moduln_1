import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhập vào năm sinh của bạn: ");
        int n = s.nextInt();
        System.out.println(Year.now().getValue() - n + " Tuổi");
        // how to get curent year in java
    }
}
