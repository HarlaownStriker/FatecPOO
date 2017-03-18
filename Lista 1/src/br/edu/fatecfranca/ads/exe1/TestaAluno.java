
package br.edu.fatecfranca.ads.exe1;

/**
 *
 * @author Oswaldo Ferreira Abreu
 */
public class TestaAluno {
    public static void main(String[] args) {
        // Criando o aluno
        Aluno obj1 = new Aluno ();
        obj1.numeroAluno = 1;
        obj1.nome = "Oswaldo";
        obj1.idade = 25;
        obj1.p1 = 8;
        obj1.p2 = 4;
        obj1.media = 0;
        System.out.println(obj1.dadosAluno());
        System.out.println(obj1.notaFinal());
        System.out.println(obj1.passou());
    }
    
}
