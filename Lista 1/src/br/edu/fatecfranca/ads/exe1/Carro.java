package br.edu.fatecfranca.ads.exe1;

/**
 *
 * @author Oswaldo Ferreira Abreu
 */
public class Carro {
    // declaração de variaveis
    public float velAtual;
    public boolean statusMotor;
    public Carro(){
        statusMotor = false;
        velAtual = 0;
    }
    // declaração de métodos
    public void ligar(){
        statusMotor = true;
        velAtual = 0;
    }
    public void desligar(){
        statusMotor = false;
        velAtual = 0;
    }
    public void acelerar(float x){
        if (statusMotor){
            velAtual = velAtual + x;
        }
    }
    public void frear(float x){
        if (statusMotor){
            velAtual = velAtual - x;
        }
    }
    public String paraString(){
        return "Status do Motor " + statusMotor + " Velocidade " + velAtual;        
    }
}
