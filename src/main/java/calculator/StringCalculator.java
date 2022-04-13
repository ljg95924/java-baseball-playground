package calculator;

import java.util.Scanner;

public class StringCalculator {

    public static int[] InputNumbers(int length) {
        int numbers[] = new int[length / 2 + 1];

        return numbers;
    }

    public static int calculate(String value, int number, int result) {
        if (value.equals("+")) {
            result += number;
        }
        if (value.equals("-")) {
            result -= number;
        }
        if (value.equals("/")) {
            result /= number;
        }
        if (value.equals("*")) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("계산할 숫자 입력");
        String value = scanner.nextLine();
        String[] values = value.split(" ");

        int[] numbers = InputNumbers(values.length);

        int j = 0;

        for (int i = 0; i < values.length; i += 2) {
            numbers[j] = Integer.parseInt(values[i]);
            j++;

        }
        int result = numbers[0];
        j = 1;

        for (int i = 1; i < values.length; i +=2) {
            result =calculate(values[i], numbers[j],result);
            j++;
        }
        System.out.println("결과: "+result);
    }
}
