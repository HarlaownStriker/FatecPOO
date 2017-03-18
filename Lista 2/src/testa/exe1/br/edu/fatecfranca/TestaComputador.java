package testa.exe1.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.Computador;
import javax.swing.JOptionPane;

public class TestaComputador {
    public static void main(String[] args) {
        // TODO code application logic here
        Computador cp1 = new Computador("Pentium I");
        Computador.ram = 256;
        JOptionPane.showMessageDialog(null, cp1.mostra());
        cp1.alteraProcessador("Pentium II");
        Computador.alteraRam(512);
        JOptionPane.showMessageDialog(null, cp1.mostra());
        Computador.upgrade();
        JOptionPane.showMessageDialog(null, cp1.mostra());
    }
    
}
