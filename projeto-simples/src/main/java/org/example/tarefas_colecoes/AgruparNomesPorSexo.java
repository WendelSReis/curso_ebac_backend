import java.util.*;

public class AgruparNomesPorSexo {
    public static void main(String[] args) {
        // Crie um Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);

        // Peça ao usuário que insira os nomes no formato "nome - sexo" separados por vírgula
        System.out.print("Digite os nomes no formato 'nome - sexo' separados por vírgulas: ");
        String input = scanner.nextLine();

        // Feche o scanner após a leitura
        scanner.close();

        // Divida os nomes com base na vírgula
        String[] nomesArray = input.split(",");

        // Crie mapas para armazenar os nomes agrupados por sexo
        Map<String, List<String>> nomesPorSexo = new HashMap<>();
        nomesPorSexo.put("Masculino", new ArrayList<>());
        nomesPorSexo.put("Feminino", new ArrayList<>());

        // Preencha os mapas com os nomes apropriados
        for (String nome : nomesArray) {
            String[] partes = nome.trim().split(" - ");
            if (partes.length == 2) {
                String nomePessoa = partes[0];
                String sexo = partes[1];

                if ("Masculino".equalsIgnoreCase(sexo)) {
                    nomesPorSexo.get("Masculino").add(nomePessoa);
                } else if ("Feminino".equalsIgnoreCase(sexo)) {
                    nomesPorSexo.get("Feminino").add(nomePessoa);
                }
            }
        }

        // Imprima os grupos separados por sexo no console
        for (Map.Entry<String, List<String>> entry : nomesPorSexo.entrySet()) {
            String sexo = entry.getKey();
            List<String> nomes = entry.getValue();

            System.out.println(sexo + ": " + String.join(", ", nomes));
        }
    }
}
