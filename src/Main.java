import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] fractionalNumbers =
                {7.1, 17.7, -9.3, -1.5, 3.4, 9.9, 99.9, -13.5, 77.7, -7.7, 69.2, 44.4, -34.8, 9.6, 15.2};
        double sum = 0;
        int count = 0;
        boolean foundNegative = false;

        for (double number : fractionalNumbers) {
            if (foundNegative && number > 0) {
                sum += number;
                count++;
            }
            if (number < 0) {
                foundNegative = true;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + average);
        } else {
            System.out.println("После первого отрицательного числа не было положительных чисел.");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

        input = input.replaceAll(" ", "").toLowerCase();
        input = input.replaceAll(",", "").toLowerCase();

        boolean isPalindrome = true;

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Введенная строка является палиндромом.");
        } else {
            System.out.println("Введенная строка не является палиндромом.");
        }
    }
}