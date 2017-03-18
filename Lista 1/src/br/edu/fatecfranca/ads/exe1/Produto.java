package br.edu.fatecfranca.ads.exe1;

/**
 *
 * @author Oswaldo Ferreira Abreu
 */
public class Produto {
    public int id;
    public String descricao;
    public int qtde;
    public float preco;    
    //Construtores    
public Produto (){
    id = 0;
    descricao = "";
    qtde = 0;
    preco = 0;
}
public Produto(int id, String descricao, int qtde, float preco){
    this.id = id;
    this.descricao = descricao;
    this.qtde = qtde;
    this.preco = preco;
}
    //metodos
public void comprar(int x){
    qtde = qtde + x;
}
public void vender(int x){
    qtde = qtde -x;
}
public void subir(float x){
    preco = preco + x;
}
public void descer(float x){
    preco = preco - x;
}
public String mostra(){
    return "ID: " + id + " Descrição: " + descricao + " Quantidade: " + qtde + " Preço: " + preco;
}
    
}
