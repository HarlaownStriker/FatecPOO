package testa.exe1.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.Cliente;
import javax.swing.JOptionPane;

public class TestaCliente {
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente Fulano = new Cliente("1","1","Fulano");
        Fulano.realizarDeposito(100);
        Fulano.realizarSaque(50);
        JOptionPane.showMessageDialog(null, Fulano.imprimir());
        
        Cliente Beltrano = new Cliente ("2", "2","Beltrano");
        Beltrano.realizarDeposito(500);
        Beltrano.realizarSaque(100);
        JOptionPane.showMessageDialog(null, Beltrano.imprimir());
        JOptionPane.showMessageDialog(null, Fulano.imprimir());
        
        Cliente novo = Cliente.retornaNovo(Fulano, Beltrano);
        JOptionPane.showMessageDialog(null, novo.imprimir());

        JOptionPane.showMessageDialog(null, Cliente.verificaTamanho("123456"));
        
    }
    
}
