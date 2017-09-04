package JavaBuclesExercises;

import javax.swing.JOptionPane;

public class Exercise7 {

    public static void main(String[] args) {

        int money;

        money = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de dinero inicial:"));
        
        for (int i = 0; i < 12; i++) {
            int interest = (money * 2)/100;
            money += interest;
        }

        System.out.print("Dinero en 12 meses " + money + "\n");
    }
}