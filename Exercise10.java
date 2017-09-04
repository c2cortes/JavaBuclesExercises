package JavaBuclesExercises;

import javax.swing.JOptionPane;

public class Exercise10 {

    public static void main(String[] args) {
        int cantPeople = 2;
        int[] weightIni, avgs;
        weightIni = new int[cantPeople];
        avgs = new int[cantPeople];

        for (int w = 0; w < cantPeople; w++) {
            weightIni[w] = Integer.parseInt(JOptionPane.showInputDialog("Peso inicial persona "+ (w+1) +":\n"));
        }

        for (int i = 0; i < cantPeople; i++) {
            int wPerson = 0;
            for (int e = 0; e < 2; e++) {
                wPerson += Integer.parseInt(JOptionPane.showInputDialog("Peso báscula "+ (e+1) +" - persona "+(i+1)+":\n"));
            }    
            avgs[i] = wPerson / 2;           

            if(avgs[i] > weightIni[i]) System.out.print("Persona "+i+" - SUBIÓ \n");
            else if(avgs[i] < weightIni[i]) System.out.print("Persona "+i+" - BAJÓ \n");
            else System.out.print("Persona "+i+" - IGUAL \n");
        }
    }
}