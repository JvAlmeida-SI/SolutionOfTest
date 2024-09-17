package com.problem.solution;

public class Questao3 {

    public void retornaSoma(){
        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice){
            k += 1;
            soma += k;
        }

        System.out.println("O valor da variável soma é "+ soma);
    }
}
