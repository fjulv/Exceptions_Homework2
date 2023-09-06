import java.util.Scanner;

public class Task4 {
//    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    Scanner sc = new Scanner(System.in);

    public void notEmptyString() {
        while (!sc.nextLine().isEmpty()) {
            notEmptyString();
        }
        throw new RuntimeException("Пустые строки вводить нельзя");
    }
}
