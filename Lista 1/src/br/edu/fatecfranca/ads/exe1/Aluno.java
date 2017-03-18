package br.edu.fatecfranca.ads.exe1;

/**
 *
 * @author Oswaldo Ferreira Abreu
 */
public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;
    public float media;
    // Construtor
    public Aluno(){
        numeroAluno = 0;
        nome = "";
        idade = 0;
        p1 = 0;
        p2 = 0;
        media = 0;
    }
    public String notaFinal(){
        media = (p1 + p2) / 2;
        return "Média: " + media;        
    }
    public String dadosAluno(){
        return "Numero: " + numeroAluno + " Nome: " + nome + " Idade: " + idade;
    }
    public String passou(){
        if (media >= 6)
            return "Aprovado";
        else
            return "Reprovado";                 
    }
}