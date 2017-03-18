package br.edu.fatecfranca.ads.exe1;

import javax.swing.JOptionPane;

/**
 *
 * @author Oswaldo Ferreira Abreu
 */
public class TestaProduto {
    public static void main(String[] args) {
        //Criando produto modo1
        Produto prod1 = new Produto();
        prod1.id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        prod1.descricao = JOptionPane.showInputDialog("Descrição");
        prod1.qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
        prod1.preco = Float.parseFloat(JOptionPane.showInputDialog("Preço"));
        //Metodos
        prod1.comprar(20);
        prod1.vender(10);
        prod1.subir(100);
        prod1.descer(50);
        //System.out.println(prod1.mostra());
        JOptionPane.showMessageDialog(null, prod1.mostra());
        //Criando produto modo1
        int a = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String b = (JOptionPane.showInputDialog("Descrição"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
        float d = Float.parseFloat(JOptionPane.showInputDialog("Preço"));
        //nome das variaveis nao importa desde que os tipos sejam os mesmos do construtor
        Produto prod2 = new Produto(a, b, c, d);
        //Metodos
        prod2.comprar(1000);
        prod2.vender(500);
        prod2.subir(10000);
        prod2.descer(1);
        //System.out.println(prod2.mostra());
        JOptionPane.showMessageDialog(null, prod2.mostra());
        
        
        
        
    }
    
}
