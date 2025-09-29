import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[8];
        double[] mediasBimestrais = new double[4];
        double[] mediasSemestrais = new double[2];
        double mediaFinal;

        System.out.println("=== SISTEMA ESCOLAR ===");
        
        // Entrada das notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // Cálculo das médias bimestrais
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2.0;
        }

        // Cálculo das médias semestrais
        mediasSemestrais[0] = (mediasBimestrais[0] + mediasBimestrais[1]) / 2.0;
        mediasSemestrais[1] = (mediasBimestrais[2] + mediasBimestrais[3]) / 2.0;

        // Cálculo da média final
        mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2.0;

        // Exibição dos resultados
        System.out.println("\n=== RESULTADOS ===");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Média do %dº bimestre: %.2f%n", (i + 1), mediasBimestrais[i]);
        }
        for (int i = 0; i < 2; i++) {
            System.out.printf("Média do %dº semestre: %.2f%n", (i + 1), mediasSemestrais[i]);
        }
        System.out.printf("Média Final: %.2f%n", mediaFinal);

        sc.close();
    }
}
