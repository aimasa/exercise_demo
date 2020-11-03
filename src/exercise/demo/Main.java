package exercise.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        printStr(str);

    }

    public static void printStr(int num) {
        if(num == 1){
            System.out.println("XGD");
        }
        char[][] xChar = new char[][]{
                {'x', ' ', ' ', ' ', 'x'},
                {' ', 'x', ' ', 'x', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', 'x', ' ', 'x', ' '},
                {'x', ' ', ' ', ' ', 'x'}};

        char[][] GChar = new char[][]{
                {' ', 'G', 'G', 'G', ' '},
                {'G', ' ', ' ', ' ', ' '},
                {'G', ' ', ' ', 'G', 'G'},
                {'G', ' ', ' ', ' ', 'G'},
                {' ', 'G', 'G', 'G', 'G'}};
        char[][] DChar = new char[][]{
                {'D', 'D', 'D', ' ', ' '},
                {'D', ' ', ' ', 'D', ' '},
                {'D', ' ', ' ', ' ', 'D'},
                {'D', ' ', ' ', 'D', ' '},
                {'D', 'D', 'D', ' ', ' '}};
        int N = (int)Math.pow(5, (num - 1));
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 3 * N; j++){
                int x = j/N;
                int j1 = i;
                int j2 = j % N;
                int b = N;
                while (N > 5){
                    int z1 = j1;
                    int z2 = j2;
                    while(z1 < 5){
                        z1 = z1;
                    }

                    if(j < 5){
                        System.out.print(xChar[j1][j2]);
                    } else {
                        j1 = j1 / 5;

                        j1 = j1 / 5;
                    }
                }
            }

        }

    }
}