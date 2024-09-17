package com.problem.solution;

import java.util.ArrayList;

public class Questao1 {

    public void verificaNumero (int numero){
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        int i = 2;

        while (fibonacci.get(i - 1) < numero) {
            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
            i++;
        }

        if(fibonacci.contains(numero)){
            System.out.println("O número "+ numero +" pertence a seqência de Fibonnaci");
        } else {
            System.out.println("O número "+ numero +" não pertence a seqência de Fibonnaci");
        }
    }
}
