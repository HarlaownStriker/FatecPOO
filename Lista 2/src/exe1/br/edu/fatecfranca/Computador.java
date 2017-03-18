package exe1.br.edu.fatecfranca;
public class Computador {
    public String processador;
    public static int ram;
    
    public Computador (){
        this.processador = "";
    }
    
    public Computador (String processador){
        this.processador = processador;
    }
    
    public void alteraProcessador (String x){
        this.processador = x;
    }
    
    public static void alteraRam (int x){
        Computador.ram = x;
    }
    
    public static void upgrade (){
        Computador.ram += 256;
        
    }
    
    public String mostra(){
        return "Processador: " + this.processador + " ,Memória Ram: " +
                Computador.ram;
    }
    
}

