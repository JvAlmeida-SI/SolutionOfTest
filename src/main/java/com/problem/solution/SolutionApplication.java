package com.problem.solution;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolutionApplication {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------");
        System.out.println("Questão 1");
        Questao1 q1 = new Questao1();
        q1.verificaNumero(55);
        q1.verificaNumero(10);
        q1.verificaNumero(7);

        System.out.println("----------------------------------------------------------");
        System.out.println("Questão 2");
        Questao2 q2 = new Questao2();
        q2.verificaTexto("Teste");
        q2.verificaTexto("Debate sobre Inteligência Artificial.");
        q2.verificaTexto("Alma");

        System.out.println("----------------------------------------------------------");
        System.out.println("Questão 3");
        Questao3 q3 = new Questao3();
        q3.retornaSoma();

        System.out.println("----------------------------------------------------------");
        System.out.println("Questão 4");
        Questao4 q4 = new Questao4();
        q4.completaProxElemento();

        System.out.println("----------------------------------------------------------");
        System.out.println("Questão 5");
        Questao5 q5 = new Questao5();
        q5.verificaInterruptores();
    }

}
