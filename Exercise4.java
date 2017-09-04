package JavaBuclesExercises;

import javax.swing.JOptionPane;

public class Exercise4 {

    public static void main(String[] args) {

    	int[] sales;
    	int totalSale = 0;
    	int totalCommissions = 0;

    	int cantEmployees = 0;
        int salary = 1000000;
        int salesEmployee1 = 0, salesEmployee2 = 0, salesEmployee3 = 0;
        int totalSales = 0;

        cantEmployees = Integer.parseInt(JOptionPane.showInputDialog("Número de empleados:"));
        sales = new int[cantEmployees];

        for (int e = 0; e < cantEmployees; e++) {
			int salesEmployee = Integer.parseInt(JOptionPane.showInputDialog("Ventas del empleados "+ (e+1) +":"));        	
			sales[e] = salesEmployee;
        }

        for (int d = 0; d < sales.length; d++) {
        	totalSale += sales[d];
        	double comission = sales[d] * 0.10;
        	totalCommissions += comission;
        	System.out.print("Total dinero empleado " + (d+1) + ": " + (sales[d] + comission) + "\n");
        	System.out.print("Dinero por concepto de comisiones empleado " + (d+1) + ": " + comission + "\n");
        }

        System.out.print("Venta de todos los trabajadores: " + totalSale + "\n");
        System.out.print("Venta de comisiones: " + totalCommissions + "\n");
    }
}