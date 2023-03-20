import java.util.Scanner;

public class ExemplosRevisao {
    Scanner sc = new Scanner(System.in);

    //Criando métodos da Classe
    public void exemplo1() {
        //Criar um Projeto para 2 Notas e a Frequência
        //e falar se o aluno está reprovado ou aprovado
        //1. ler a primeira nota
        System.out.println("Informe a Primeira Nota do Aluno ");
        double nota1 = sc.nextDouble();
        //2. ler a segunda nota
        System.out.println("Informe a Segunda Nota do Aluno ");
        double nota2 = sc.nextDouble();
        //3. calcular a média das notas
        double media = (nota1+nota2)/2;
        //4. mostrar a média calculada
        System.out.println("A média do aluno é: "+media);
        //5. Informe o total de aulas
        System.out.println("Professor, informe o total de aulas dadas ");
        double aulasDadas = sc.nextDouble();
        //6. informar quantidade de faltas dos alunos
        System.out.println("Professor, informe nº de faltas do aluno");
        double nfaltas = sc.nextDouble();
        //7. calcular a % de frequencia
        double frequencia = ((aulasDadas-nfaltas)/aulasDadas*100); //transformando em %porcentagem
        //8. Mostrar a % de Frequência do aluno
        System.out.println("O aluno teve "+frequencia+"% de frequencia");
        //9. se (media>=50 e Frequencia>=75)
        if (media>=50 && frequencia>=75) {
            System.out.println("Aluno Aprovado ");
        } else if (media<50 && frequencia>=75) {
            System.out.println("Aluno de Recuperação ");
        } else {
            System.out.println("Aluno Reprovado ");
        }
    }
}
