package JavaBuclesExercises;

import javax.swing.JOptionPane;

public class Exercise8 {

    public static void main(String[] args) {

        int amarilla = 0, rosa = 0, roja = 0, verde = 0, azul = 0;
        int vehiclesCant;

        vehiclesCant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de vehículos:"));
        
        for (int i = 0; i < vehiclesCant; i++) {

        	int lastNumber = Integer.parseInt(JOptionPane.showInputDialog("Último número de la placa, vehículo "+(i+1)+": \n"));

            if(lastNumber == 1 || lastNumber == 2) amarilla++;
            else if(lastNumber == 3 || lastNumber == 4) rosa++;
            else if(lastNumber == 5 || lastNumber == 6) roja++;
            else if(lastNumber == 7 || lastNumber == 8) verde++;
            else if(lastNumber == 9 || lastNumber == 0) azul++;
        }

        System.out.print("Candidad de vehículos con calcomanía amarilla: "+ amarilla +" \n");
        System.out.print("Candidad de vehículos con calcomanía rosa: "+ rosa +" \n");
        System.out.print("Candidad de vehículos con calcomanía roja: "+ roja +" \n");
        System.out.print("Candidad de vehículos con calcomanía verde: "+ verde +" \n");
        System.out.print("Candidad de vehículos con calcomanía azul: "+ azul +" \n");
    }
}