package JavaBuclesExercises;

import javax.swing.JOptionPane;

public class Exercise9 {

    public static void main(String[] args) {

        int clients, totalclients;
        int items;
        int total = 0;

        totalclients = Integer.parseInt(JOptionPane.showInputDialog("Cantidad clientes:"));

        for (int c = 0; c < totalclients; c++) {
            int article1 = Integer.parseInt(JOptionPane.showInputDialog("Valor artículo 1 - cliente"+(c+1)+":\n"));
            int article2 = Integer.parseInt(JOptionPane.showInputDialog("Valor artículo 2 - cliente"+(c+1)+":\n"));
            int article3 = Integer.parseInt(JOptionPane.showInputDialog("Valor artículo 3 - cliente"+(c+1)+":\n"));

            int totalClient = article1 + article2 + article3;
            total += totalClient;
            System.out.print("Valor a pagar del cliente "+(c+1)+": " + totalClient+"\n");
        }

        System.out.print("Valor total de las compras de todos los clientes "+total);
    }
}