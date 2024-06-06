import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");

        double[] salary = new double[5];
        salary[0] = 10000;
        salary[1] = 15000;
        salary[2] = 20000;
        salary[3] = 30000;
        salary[4] = 70000;
        double summa = 0;

        for (int i = 0; i < salary.length; i++) {
            summa = summa + salary[i];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей.");

        System.out.println("Task2");

        double[] salaryInWeek = {1000, 2500, 44000, 7000, 2000};
        double max = -1;
        for (int i = 0; i < salaryInWeek.length; i++) {
            if (salaryInWeek[i] > max) {
                max = salaryInWeek[i];
            }
        }
        double min = max;
        for (int i = 0; i < salaryInWeek.length; i++) {
            if (salaryInWeek[i] < min) {
                min = salaryInWeek[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. " +
                "Максимальная сумма трат за неделю составила %s рублей\n", min, max);

        System.out.println("Task3");

        double numberOfDaysInAMonth = 31;
        double numberOfDaysInAWeek = 7;
        double numberOfWeeksInAMonth = numberOfDaysInAMonth / numberOfDaysInAWeek;
        // System.out.println(numberOfWeeksInAMonth);
        double[] salaryInMonth2 = new double[5];
        salaryInMonth2[0] = 10000;
        salaryInMonth2[1] = 25000;
        salaryInMonth2[2] = 7000;
        salaryInMonth2[3] = 98000;
        salaryInMonth2[4] = 23000;
        double summa2 = 0;
        for (int i = 0; i < salaryInMonth2.length; i++) {
            summa2 = summa2 + salaryInMonth2[i];
        }
        summa2 = summa2 / numberOfWeeksInAMonth;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей \n", summa2);

        System.out.println("Task4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(" ");
    }
}