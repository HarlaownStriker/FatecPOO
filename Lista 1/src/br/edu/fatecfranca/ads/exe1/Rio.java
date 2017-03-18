package br.edu.fatecfranca.ads.exe1;
/**
 *
 * @author Oswaldo Ferreira Abreu
 */
public class Rio {
    //nome(String), nível (float) e poluído (boolean)
    public String nome;
    public float nivel;
    public boolean poluido;
    //Construtores
    public Rio(){
        nome = "";
        nivel = 0;
        poluido = false;
    }
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    //Metodos
    public void chover(float x){
        nivel = nivel + x;
    }
    public void ensolarar(float x){
        nivel = nivel - x;
    }
    public void limpar(){
        poluido = false;
    }
    public void sujar(){
        poluido = true;
    }
    public String mostra(){
        return "Nome: " + nome + " Nível: " + nivel + " Poluído?: " + poluido;
    }    
}
