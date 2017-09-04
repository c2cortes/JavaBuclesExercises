package JavaBuclesExercises;

import javax.swing.JOptionPane;

public class Exercise3 {

    public static void main(String[] args) {

        String option = "";
        int optionNumber = 0;

        while (optionNumber != 6){
            option = JOptionPane.showInputDialog("Seleccione una opción: \n 1.Registrar empleado \n 2.Buscar empleado \n 3.Actualizar empleado \n 4.Eliminar empleado \n 5.Liquidar empleado \n 6.Salir");
            optionNumber = Integer.parseInt(option);
        }
    }
}