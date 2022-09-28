
package Model;

import javax.swing.JOptionPane;

//Mudar para ClasseX_DAO
public class Classex {
    public static double v1 =0;
    public static double v2 = 0;
    public static int op = 0;
    public static void Soma(double valor1,double valor2){
        JOptionPane.showMessageDialog(null,"A soma dos valores é: " + (valor1 + valor2));
    }
    public static void Mult(double valor1,double valor2){
        JOptionPane.showMessageDialog(null,"A multiplicação dos valores é: " + (valor1 * valor2));
    }
    public static void Div(double valor1,double valor2){
        JOptionPane.showMessageDialog(null,"A divisão dos valores é: " + (valor1 / valor2));
    }
    public static void Sub(double valor1,double valor2){
        JOptionPane.showMessageDialog(null,"A subtração dos valores é: " + (valor1 - valor2));
    }
}
