
package Model;

import javax.swing.JOptionPane;

//Mudar para Tela_DAO
public class Tela {
    
    public static void SolicitarOperacao(){
        int op = Model.Classex.op;
        do {
            String dg = JOptionPane.showInputDialog(null,"Digite o primeiro valor");
            double v1 = Model.Classex.v1 = Double.parseDouble(dg);
            dg = JOptionPane.showInputDialog(null,"Digite o segundo valor");
            double v2 = Model.Classex.v2 = Double.parseDouble(dg);
            dg = JOptionPane.showInputDialog(null,"Qual operação você deseja realizar?"
                    + "\n*Digite um número para selecionar a operação*"
                    + "\n1 - Soma"
                    + "\n2 - Multiplicação"
                    + "\n3 - Divisão"
                    + "\n4 - Subtração");
            op = Model.Classex.op = Integer.parseInt(dg);
            switch(op){
                case 1:
                    Model.Classex.Soma(v1, v2);
                break;
                case 2:
                    Model.Classex.Mult(v1, v2);
                break;
                case 3:
                    Model.Classex.Div(v1, v2);
                break;
                case 4:
                    Model.Classex.Sub(v1, v2);
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Escolha inválida, escolha novamente");
                break;
            }
            
        } while (op >= 5 || op <= 0);
        
    }
}
