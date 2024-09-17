package com.problem.solution;

public class Questao5 {

    public void verificaInterruptores(){
        /*
         1 - Ligar o primeiro interruptor e esperar até que a lâmpada aqueça
         2 - Depois desligue o primeiro interruptor e ligue o segundo
         3 - Por fim, visitando apenas 2 salas, será possível verificar qual interruptor pertence a qual lâmpada
        */

        boolean[] interruptores = {false, false, false};
        boolean[] lampadas = {false, false, false};
        boolean[] lampadasAquecidas = {false, false, false};

        interruptores[0] = true;
        lampadas[0] = true;
        lampadasAquecidas[0] = true;
        interruptores[0] = false;
        lampadas[0] = false;
        interruptores[1] = true;
        lampadas[1] = true;

        for (int i = 0; i < 3; i++) {
            if (lampadas[i]) {
                System.out.println("A lâmpada " + (i + 1) + " está acesa. Controlada pelo interruptor " + (i + 1));
            } else if (lampadasAquecidas[i]) {
                System.out.println("A lâmpada " + (i + 1) + " está quente, mas apagada. Controlada pelo interruptor " + (i + 1));
            } else {
                System.out.println("A lâmpada " + (i + 1) + " está fria e apagada. Controlada pelo interruptor " + (i + 1));
            }
        }
    }
}
