package beforech6;

import java.util.Arrays;
import java.util.Scanner;

public class Delimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] new_input = input.split(" ") ;

        System.out.println(Arrays.toString(new_input));

    }
}
