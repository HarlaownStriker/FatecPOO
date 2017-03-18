
package br.edu.fatecfranca.ads.exe1;

/**
 *
 * @author Oswaldo Ferreira Abreu
 */
public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;
    // construtor
    public Cliente(){
        numeroConta = 0;
        numeroAgencia = 0;
        nome = "";
        saldo = 0;
    }
    // metodos
    public void realizarDeposito(float x){
        saldo = saldo + x;
    }
    public void realizarSaque(float x){
        saldo = saldo - x;
    }
    public String dadosCliente(){
        return "Numero da conta: " + numeroConta + " Nome: " + nome + " Saldo: " + saldo;
    }   
}
