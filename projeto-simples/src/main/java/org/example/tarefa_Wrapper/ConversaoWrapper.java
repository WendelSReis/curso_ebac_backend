package org.example.tarefa_Wrapper;

import java.util.Scanner;

public class ConversaoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor numérico
        System.out.println("Digite um valor numérico: ");
        int valorPrimitivo = scanner.nextInt();

        // Conversão para o tipo Wrapper (Integer neste caso)
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // Impressão do valor Wrapper
        System.out.println("Valor Wrapper: " + valorWrapper);

        scanner.close();
    }
}

