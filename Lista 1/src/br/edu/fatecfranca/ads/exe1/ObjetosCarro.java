package br.edu.fatecfranca.ads.exe1;

import javax.swing.JOptionPane;

/**
 *
 * @author Oswaldo Ferreira Abreu
 */
public class ObjetosCarro {
    public static void main(String args[]){
        // criando os objetos
        Carro obj1 = new Carro();
        // Mostrar os dados usando o metodo de converter para String
        System.out.println(obj1.paraString());
        Carro obj2 = new Carro();
        // Outra forma para mostrar os dados
        Carro obj3 = new Carro();
        // Brincando com os objetos
        obj1.ligar();
        System.out.println(obj1.paraString());
        float aumenta = Float.parseFloat(JOptionPane.showInputDialog("Quanto quer acelerar obj1?"));
        obj1.acelerar(aumenta);
        System.out.println(obj1.paraString());
        obj2.ligar();
        JOptionPane.showMessageDialog(null, obj2.paraString());
        obj2.acelerar(90);
        JOptionPane.showMessageDialog(null, obj2.paraString());
        obj2.frear(20);
        JOptionPane.showMessageDialog(null, obj2.paraString());
    }
    
}
