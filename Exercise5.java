package JavaBuclesExercises;

import javax.swing.JOptionPane;

public class Exercise5 {

    public static void main(String[] args) {

    	int[] hours;

    	int cantEmployees = 0;
        int salary = 1000000;
        int salesEmployee1 = 0, salesEmployee2 = 0, salesEmployee3 = 0;
        int totalSales = 0;

        cantEmployees = Integer.parseInt(JOptionPane.showInputDialog("Número de empleados:"));
        hours = new int[cantEmployees];

        for (int e = 0; e < cantEmployees; e++) {
			int hoursEmployee = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de horas del empleados "+ (e+1) +":"));        	
			hours[e] = hoursEmployee;
        }

        int i = 0;
        while(i < hours.length){
            int payment = 0;
            if(hours[i] <= 40) payment = hours[i] * 2000;
            else if(hours[i] > 40) payment = ((80000) + ((hours[i] - 40) * 2500));

            System.out.print("El pago del empleado " + (i+1) + ":" + payment + "\n");
            i++;
        }
    }
}