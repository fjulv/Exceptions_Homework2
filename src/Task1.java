import java.util.Scanner;

public class Task1 {
//    ���������� �����, ������� ����������� � ������������ ���� �������� ����� (���� float),
//    � ���������� ��������� ��������.
//    ���� ������ ������ ����� �� ������ ��������� � ������� ����������, ������ �����, ���������� �������� ��������� � ������������ ���� ������.

    Scanner sc = new Scanner(System.in);

    public float returnNumber() {
        float num = 0f;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("����� ������� �����:");
                num = Float.parseFloat(sc.next());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("������� �� �����, �������� ��� ���");
            }
        }
        return num;
    }
}
