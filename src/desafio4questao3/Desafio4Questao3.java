package desafio4questao3;

import javax.swing.JOptionPane;

/**
 * @author Jeferson Leon
 */
public class Desafio4Questao3 {

    /**
     * Escreva um algoritmo que leia 2 vetores de 10 elementos inteiros. Crie um
     * terceiro vetor que seja a união dos dois primeiros. Mostre o vetor
     * resultante.
     */
    public static void main(String[] args) {
        int vet1[], vet2[], vet3[];
        vet1 = new int[3];
        vet2 = new int[3];
        vet3 = new int[6];
        int i;
        String v1 = "Vetor 1\n", v2 = "Vetor 2\n", v3 = "Vetor 3\n";

        for (i = 0; i < vet1.length; i++) {
            vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Vetor 1 - insira um numero:"));
            v1 += vet1[i] + "\n";
        }
        for (i = 0; i < vet1.length; i++) {
            vet2[i] = Integer.parseInt(JOptionPane.showInputDialog("Vetor 2 - insira um numero:"));
            v2 += vet2[i] + "\n";
        }
        for (i = 0; i < vet3.length; i++) {
            if (i < vet1.length) {
                vet3[i] = vet1[i];
                v3 += vet3[i] + "\n";
            } else {
                vet3[i] = vet2[i - vet1.length]; //vet3 i = 5 <- vet2 i = 0 (5) 
                v3 += vet3[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, v1);
        JOptionPane.showMessageDialog(null, v2);
        JOptionPane.showMessageDialog(null, v3);
    }

}
