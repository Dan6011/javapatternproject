
//
// name: Danilo Vranic
// date: 2026-10-28
// description: Prints different patterns using loops
//

public class Patterns {

    //
    // Pre condition rows is a positive number of lines
    // Post condition prints stars that increase each row
    //
    public static void stars(int rows) {
        int i = 1;

        while (i <= rows) {
            int j = 0;

            while (j < 2 * i - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }

    //
    // Pre condition rows is a positive number of lines
    // Post condition prints a triangle using numbers
    //
    public static void triangle(int rows) {
        if (rows > 0) {
            int line = 1;

            do {
                int count = 0;

                while (count < line) {
                    System.out.print(line);
                    count++;
                }

                System.out.println();
                line++;
            } while (line <= rows);
        }
    }

    //
    // Pre condition start is a positive odd number
    // Post condition prints odd numbers going down to 1
    //
    public static void odds(int start) {
        for (int num = start; num > 0; num -= 2) {
            for (int i = 0; i < num; i++) {
                System.out.print(num);
            }

            System.out.println();
        }
    }

    //
    // Pre condition maxE is a positive number of lines
    // Post condition prints an E and O pattern
    //
    public static void eo(int maxE) {
        int firstLine = 1;

        if (maxE % 2 == 1) {
            firstLine = 0;
        }

        int line = 1;

        while (line <= maxE) {
            int count = 0;

            while (count < line) {
                if ((line + firstLine) % 2 == 0) {
                    System.out.print("O");
                } else {
                    System.out.print("E");
                }
                count++;
            }

            System.out.println();
            line++;
        }

        line = maxE - 1;

        while (line > 0) {
            int count = 0;

            while (count < line) {
                if ((line + firstLine) % 2 == 0) {
                    System.out.print("O");
                } else {
                    System.out.print("E");
                }
                count++;
            }

            System.out.println();
            line--;
        }
    }

    //
    // Pre condition rows is a positive number of lines
    // Post condition prints an upside down number pyramid
    //
    public static void pyramid(int rows) {
        int line = 1;

        while (line <= rows) {
            int spaces = 1;

            while (spaces < line) {
                System.out.print(" ");
                spaces++;
            }

            int count = 0;
            int digits = 2 * (rows - line) + 1;

            while (count < digits) {
                System.out.print(line);
                count++;
            }

            System.out.println();
            line++;
        }
    }

    //
    // Pre condition None
    // Post condition runs all the patterns
    //
    public static void main(String[] args) {
        stars(7);
        System.out.println();

        triangle(9);
        System.out.println();

        odds(9);
        System.out.println();

        eo(6);
        System.out.println();

        pyramid(5);
    }
}
