package com.problem.solution;

public class Questao2 {

    public void verificaTexto(String texto){
        int contador = 0;

        for (int i = 0; i < texto.length(); i++){

            char caracterAtual = texto.charAt(i);

            if (caracterAtual == 'A' || caracterAtual == 'a'){
                contador++;
            }
        }

        if(contador>1){
            System.out.println("O texto informado possui "+ contador +" letras 'a'.");
        } else if (contador == 1) {
            System.out.println("O texto informado possui "+ contador +" letra 'a'.");
        } else {
            System.out.println("O texto informado não possui nenhuma letra 'a'.");
        }
    }
}
