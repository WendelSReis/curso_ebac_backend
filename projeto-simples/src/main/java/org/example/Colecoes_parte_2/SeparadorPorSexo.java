package org.example.Colecoes_parte_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SeparadorPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        while (true) {
            System.out.println("Digite um nome (ou 'sair' para encerrar):");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o sexo (M para masculino, F para feminino):");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                nomesMasculinos.add(entrada);
            } else if (sexo.equalsIgnoreCase("F")) {
                nomesFemininos.add(entrada);
            } else {
                System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
            }
        }

        scanner.close();
    }
}
