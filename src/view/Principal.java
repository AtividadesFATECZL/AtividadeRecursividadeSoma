package view;

import controller.SomaController;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int entrada;
        SomaController dc = new SomaController();

        do {
            entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre um número entre 1 e 12", JOptionPane.QUESTION_MESSAGE));
        } while (entrada <= 0 || entrada > 12);


        int soma = dc.soma(entrada);
        System.out.println(soma);

    }
}
