package exe1.br.edu.fatecfranca;
public class Veiculo {
    //variáveis
    public String tipo, cor;
    public int nroRodas, ano;
    public static String nomeDono;
    
    //métodos construtores
    public Veiculo(){
        this.tipo = "";
        this.cor = "";
        this.nroRodas = 0;
        this.ano = 0;
    }
    
    public Veiculo(String tipo, String cor, int nroRodas, int ano){
        this.tipo = tipo;
        this.cor = cor;
        this.nroRodas = nroRodas;
        this.ano = ano;
    }
    
    //métodos de instância - um método de instância pode acessar uma variável de classe
    public void alteraTipo(String x){
        this.tipo = x;
    }
    
    public String mostra (){
        return "Tipo: " + this.tipo + " ,cor: " + this.cor + " ,número de rodas:"
                + this.nroRodas + " , ano: " + this.ano + "Dono: " + Veiculo.nomeDono;
    }
    
    //métodos de classe - um método de classe não acessa uma variável de instância
    public static void alteraNome(String x){
        Veiculo.nomeDono = x;
    }
    
    public static String retornaNome(){
        return "Nome: " + Veiculo.nomeDono;
    }
    
    public static String nroRodas (int x){
        if (x % 2 == 0)
            return "Número de rodas é par";
        else 
            return "Número de rodas é ímpar";
    }         
    
    public static Veiculo retornaNovoVeiculo(Veiculo v1, Veiculo v2){
        Veiculo novo = new Veiculo();
        novo.tipo = v1.tipo;
        novo.nroRodas = v1.nroRodas + v2.nroRodas;
        novo.cor = v2.cor;
        if (v1.ano >= v2.ano)
            novo.ano = v1.ano;
        else
            novo.ano = v2.ano;
                   
        return novo;
    }
    
}



