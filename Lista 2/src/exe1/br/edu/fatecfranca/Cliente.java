package exe1.br.edu.fatecfranca;
public class Cliente {
    public String numeroConta, numeroAgencia, nome;
    public static float saldo;
    
    public Cliente(){
        this.numeroConta = "";
        this.numeroAgencia = "";
        this.nome = "";
    }
    
    public Cliente (String numeroConta, String numeroAgencia, String nome){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
    } 
    
    public void realizarDeposito(float x){
        Cliente.saldo += x;
    }
    
    public void realizarSaque (float x){
        Cliente.saldo -= x;
    }
    
    public String imprimir (){
        return "Numero da Conta: " + this.numeroConta + " , Numero da Agencia: "
                + this.numeroAgencia + " , nome: " + this.nome + " , saldo: " +
                Cliente.saldo;
    }
    
    public static void alteraSaldo (float x){
        if (x > 0)
            Cliente.saldo += x;
        else 
            Cliente.saldo -= x;
    }
    
    public static float retornaSaldo (){
        return Cliente.saldo;
    }
    
    public void alteraAgencia (String x){
        this.numeroAgencia = x;
    }
    
    public String retornaAgencia (){
        return this.numeroAgencia;
    }
    
    public static Cliente retornaNovo (Cliente c1, Cliente c2){
        Cliente novo = new Cliente();
        novo.saldo = c1.saldo + c2.saldo;
        novo.numeroAgencia = c1.numeroAgencia;
        novo.numeroConta = c2.numeroConta;
        novo.nome = "Fulano";       
        return novo;
    }
    
    public static boolean verificaTamanho(String x){
        return x.length() == 6;
    }
    
    
}
