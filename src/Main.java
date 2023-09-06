public class Main {

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        float inputNumber = task1.returnNumber();
        System.out.println(inputNumber);

        Task2 task2 = new Task2();
        task2.catchResult(new int[]{1, 2, 3, 4, 5, 66, 77, 88, 1007});

        Task4 task4 = new Task4();
        task4.notEmptyString();
    }
}