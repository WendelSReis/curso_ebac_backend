package org.example.tarefas_colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class OrdenarNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes separados por vírgulas: ");
        String input = scanner.nextLine();

        scanner.close();

        // Divida os nomes com base na vírgula e armazene-os em uma lista
        String[] nomesArray = input.split(",");
        List<String> nomesList = new ArrayList<>(Arrays.asList(nomesArray));

        // Remova espaços em branco em excesso e ordene os nomes em ordem alfabética
        nomesList.replaceAll(String::trim);
        Collections.sort(nomesList);

        // Imprima os nomes ordenados no console
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomesList) {
            System.out.println(nome);
        }
    }
}
