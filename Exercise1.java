package JavaBuclesExercises;

import java.util.Scanner;

public class Exercise1 {

    private static Scanner leer;

    public static int preguntarEdad(int cantidad){
        int total = 0;
        for (int h = 1; h <= cantidad; h++) {
            System.out.print("Ingrese la edad "+h+": \n");
            total += leer.nextInt();            
        }
        return total;
    }

    public static void main(String[] args) {

        int cantidadHombres, cantidadMujeres, totalEdadHombres = 0, totalEdadMujeres = 0, promedioHombres, promedioMujeres, promedioTotal;
        leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de hombres: \n");
        cantidadHombres = leer.nextInt();
        totalEdadHombres = preguntarEdad(cantidadHombres);
        promedioHombres = totalEdadHombres / cantidadHombres;
        
        System.out.print("Ingrese la cantidad de mujeres: \n");
        cantidadMujeres = leer.nextInt();
        totalEdadMujeres = preguntarEdad(cantidadMujeres);
        promedioMujeres = totalEdadMujeres / cantidadMujeres;

        promedioTotal = (totalEdadMujeres + totalEdadHombres) / (cantidadHombres + cantidadMujeres);

        System.out.print("Promedio edad hombres: " + promedioHombres + "\n Promedio edad mujeres: " + promedioMujeres + "\n");
        System.out.print("Promedio Total: " + promedioTotal + "\n");
    }
}
