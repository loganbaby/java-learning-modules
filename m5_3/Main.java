import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[][] field = {
                {'x', ' ', ' ', ' ', 'x'},
                {' ', 'x', ' ', 'x', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', 'x', ' ', 'x', ' '},
                {'x', ' ', ' ', ' ', 'x'}
        };

        for (int i = 0; i < field.length; ++i) {
            for (int j = 0; j < field.length; ++j) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
