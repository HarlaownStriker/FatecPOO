package br.edu.fatecfranca.ads.exe1;
import javax.swing.JOptionPane;
/**
 *
 * @author Oswaldo Ferreira Abreu
 */
public class TestaRio {
    public static void main(String[] args) {
        //Criando rio modo1
        Rio rio1 = new Rio();
        Produto prod1 = new Produto();
        rio1.nome = JOptionPane.showInputDialog("Nome");
        rio1.nivel = Float.parseFloat(JOptionPane.showInputDialog("Nível"));
        rio1.poluido = false;
        rio1.chover(50);
        rio1.ensolarar(30);
        rio1.sujar();
        JOptionPane.showMessageDialog(null, rio1.mostra());
        //Criando o rio modo2
        String nomerio = JOptionPane.showInputDialog("Nome");
        float niveldorio = Float.parseFloat(JOptionPane.showInputDialog("Nível"));
        boolean poluicao = false;
        Rio rio2 = new Rio(nomerio, niveldorio, poluicao);
        rio2.chover(700);
        rio2.sujar();
        rio2.limpar();
        JOptionPane.showMessageDialog(null, rio2.mostra());        
    }
}
