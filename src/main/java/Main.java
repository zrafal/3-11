import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie liczby wierszy i kolumn od użytkownika
        System.out.print("Podaj liczbę wierszy: ");
        int rows = scanner.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        int cols = scanner.nextInt();

        // Pętla zewnętrzna iteruje po wierszach
        for (int i = 0; i < rows; i++) {
            // Pętla wewnętrzna iteruje po kolumnach
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            // Przejście do nowego wiersza po zakończeniu każdego wiersza
            System.out.println();
        }

        scanner.close();
    }
}