package Drone;

public class ConsoleCanvas {
    private int X;
    private int Y;
    private char[][] array;

    public ConsoleCanvas(int x, int y) {

        X = x;
        Y = y;
        array = new char[x][y];
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if (i == 0 || i == X - 1) {
                    array[i][j] = '#';
                } else if (j == 0 || j == Y - 1) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    public void showIt(int dx, int dy, char ch) { 
        array[dx + 1][dy + 1] = ch; 
    }

    public String toString() { 
        String print = "";
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                print += array[i][j];
            }
            print += "\n";
        }
        return print;
    }

}