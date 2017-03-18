package testa.exe1.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.Veiculo;
import javax.swing.JOptionPane;

public class TestaVeiculo {
    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo carro = new Veiculo("utilitário", "preta", 4, 2012);
        Veiculo.alteraNome("Fulano");
        Veiculo moto = new Veiculo("motocicleta", "azul", 2, 2007);
        Veiculo.alteraNome("Beltrano");
        
        JOptionPane.showMessageDialog(null, carro.mostra());
        JOptionPane.showMessageDialog(null, moto.mostra());
         
        Veiculo novo = Veiculo.retornaNovoVeiculo(moto, carro);
        
        JOptionPane.showMessageDialog(null, novo.mostra());
        
    }
    
}
