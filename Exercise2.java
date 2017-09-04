package JavaBuclesExercises;

import java.util.Scanner;

public class Exercise2 {

    private static Scanner read;

    public static int[] askForNumbers(int _cant, int[] _array)
    {
        for (int n = 0; n < _cant; n++) {
            System.out.print("Ingrese el número: \n");
            _array[n] = read.nextInt();
        }
        return _array;
    }

    public static void main(String[] args) {

        read = new Scanner(System.in);

        int[] numbers;
        int numbersCant;
        read = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de números");
        numbersCant = read.nextInt();
        numbers = new int[numbersCant];
        
        numbers = askForNumbers(numbersCant, numbers);

        for (int i = 0; i < numbers.length; i++) {
            
            int n = numbers[i];
            boolean minor = true;

            for (int c = 0; c < numbers.length; c++) {
                if(n > numbers[c]) {
                    minor = false;
                    break;
                }                                  
            }

            if(minor) System.out.print(n + " es el menorrrrr número de todos!");
        }
    }
}