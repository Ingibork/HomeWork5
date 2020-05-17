package weather;

import java.rmi.dgc.VMID;
import java.util.Scanner;

/**
 * Написать программу, отображающую статистику по осадкам
 * за N дней. N вводится пользователем.
 *     Пользователь также должен ввести N целых чисел, обозначающих
 * величину осадков в день.
 *     Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 *     Не использовать массивы!
 */

public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во дней");
        int days = scanner.nextInt();

        System.out.println("Количество дней: " + days);
        int rain = sumPrecipitation(days);
        System.out.println("Сумма осадков за этот период: " + rain);
        int average = rain / days;
        System.out.println("Среднее количество осадков за этот период: " + average);
        int midMax;
    }

    public static int sumPrecipitation(int days) {
        Scanner scanner = new Scanner(System.in);
        int aqua = 0;
        int sum = 0;
        int midMax = 0; // два значения с помощью return нельзя из функции извлечь(
        for (int i = 1; i <= days; i++) {
            System.out.println("Введите кол-во осадков " + i);
            aqua = scanner.nextInt();
            sum = sum + aqua;
            // Максимальное количество дневных осадков
            if (aqua >= midMax) {
                midMax = aqua;
            }

        }
        return sum;

    }

}



