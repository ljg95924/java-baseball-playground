package Calculator;

import java.util.Scanner;

public class StringCalculator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] values = value.split(" ");

        int numbers[] = new int[values.length / 2 + 1];
        int j = 0;
        int result = 0;
        for (int i = 0; i <= values.length; i++) {

            if (i % 2 == 0) {
                numbers[j] = Integer.parseInt(values[i]);
                j++;
            }
        }
        j = 0;
        for (int i = 0; i <= values.length-1; i++) {
            System.out.println("values: " + values[i]);
            if (i == 0) {
                result = numbers[i];
                continue;
            }

            if (values[i].equals("+")) {
                result += numbers[j+1];
                System.out.println("중간+" + result);
                j++;
            } else if (values[i].equals("-")) {
                result -= numbers[j+1];
                System.out.println("중간-" + result);
                j++;
            } else if (values[i].equals("/")) {
                result /= numbers[j+1];
                System.out.println("중간/" + result);
                j++;
            } else if (values[i].equals("*")) {
                result *= numbers[j+1];
                j++;
            }
        }
        System.out.println("result:" + result);

    }
}
