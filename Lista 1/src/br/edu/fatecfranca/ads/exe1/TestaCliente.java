package br.edu.fatecfranca.ads.exe1;

/**
 *
 * @author Oswaldo Ferreira Abreu
 */
public class TestaCliente {

    public static void main(String[] args) {
        //criando o cliente
        Cliente obj1 = new Cliente ();
        obj1.numeroConta = 255;
        obj1.numeroAgencia = 5;
        obj1.nome = "Fulano";
        obj1.saldo = 1000;
        obj1.realizarDeposito(200);
        obj1.realizarSaque(700);
        System.out.println(obj1.dadosCliente());
        //criando o segundo cliente
        Cliente obj2 = new Cliente();
        obj2.numeroConta = 100;
        obj2.numeroAgencia = 1;
        obj2.nome = "Beltrano";
        obj2.saldo = 5000;
        obj2.realizarDeposito(10000);
        obj2.realizarSaque(5000);
        System.out.println(obj2.dadosCliente());   
    }
}
