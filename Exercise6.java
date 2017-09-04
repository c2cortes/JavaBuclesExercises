package JavaBuclesExercises;

import javax.swing.JOptionPane;

public class Exercise6 {

    public static void main(String[] args) {

        int limit;
        int increment = 1;
        int currentNumber = 1;
        int sum = 0;

        limit = Integer.parseInt(JOptionPane.showInputDialog("Número límite:"));
        
        while(currentNumber <= limit){
            sum += currentNumber;
            increment += 2;
            currentNumber += increment;
        }

        System.out.print("suma " + sum + "\n");
    }
}