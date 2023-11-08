/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labfinal_carlosdelarosa_jorgesilva_samueltilano;

import javax.swing.JOptionPane;

/**
 *
 * @author Dsilv
 */
public class Labfinal_CarlosDeLaRosa_JorgeSilva_SamuelTilano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        JOptionPane.showMessageDialog(null, "BIENVENIDO A MATEMATICAS VERSATÍLES, JUEGOS Y MÁS.."
                + "\nEste es  que combina la diversión de juegos emocionantes, con calculos matematicos. Si te encanta jugar a juegos como la ruleta, Triqui, Bingo, "
                + "o eres más intelectual y te gusta el cálculo, has instalado el programa adecuado. \n⊂ ͡• ‿‿ ͡•つ", "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE);
        do {
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú\n(1)Juegos 🎰 \n(2)Matemáticas Versatiles ± \n(3)Salír 👋≧◉ᴥ◉≦", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE));
                if (op < 1 || op > 3) {
                    JOptionPane.showMessageDialog(null, "La opción Que ingresaste es invalida... Intentalo nuevamente ", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE);
                }
            } while (op < 1 || op > 3);

        } while (op != 3);
    }

}
