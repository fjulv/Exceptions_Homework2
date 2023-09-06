import java.util.Scanner;

public class Task1 {
//    –еализуйте метод, который запрашивает у пользовател€ ввод дробного числа (типа float),
//    и возвращает введенное значение.
//    ¬вод текста вместо числа не должно приводить к падению приложени€, вместо этого, необходимо повторно запросить у пользовател€ ввод данных.

    Scanner sc = new Scanner(System.in);

    public float returnNumber() {
        float num = 0f;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("¬веди дробное число:");
                num = Float.parseFloat(sc.next());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("¬ведено не число, попробуй еще раз");
            }
        }
        return num;
    }
}
