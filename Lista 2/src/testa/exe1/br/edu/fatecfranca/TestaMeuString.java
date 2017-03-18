package testa.exe1.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.MeuString;
import javax.swing.JOptionPane;

public class TestaMeuString {
    public static void main(String[] args) {
        // TODO code application logic here
        MeuString str1 = new MeuString("meu primeiro string");
        JOptionPane.showMessageDialog(null, MeuString.comprimento("meu primeiro string"));
        JOptionPane.showMessageDialog(null, MeuString.caractere("meu primeiro string"));
    }
    
}
