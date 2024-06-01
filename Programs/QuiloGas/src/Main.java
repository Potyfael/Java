import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double kmPorViagem, gasPorViagem;
        double totalKm=0, totalGas=0, kmPorGas;
        int viagens=1, sentinela;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.printf("%d Viagem:\nInsira os KMs percorridos: ", viagens);
            kmPorViagem = sc.nextDouble();
            System.out.print("Insira a quantidade de gasolina usada: ");
            gasPorViagem = sc.nextDouble();

            // incrementa as variaveis
            viagens++;
            totalKm += kmPorViagem;
            totalGas += gasPorViagem;
            kmPorGas = kmPorViagem / gasPorViagem;
            System.out.printf("Quilometro por gasolina: %dKm\n", (int) kmPorGas);

            // testa o valor de sentinela
            System.out.print("Deseja continuar? [0 Nao} [1 Sim]: ");
            sentinela = sc.nextInt();
        } while (sentinela != 0);

        // calcula e exibe os dados
        System.out.printf("\nTotal de viagens: %d\n", viagens);
        System.out.printf("Total de km: %d\n", (int) totalKm);
        System.out.printf("Total de gasolina: %.2f litros\n", totalGas);
        kmPorGas = totalKm / totalGas;
        System.out.printf("Media: %dKm por litro de gasolina", (int) kmPorGas);
    }
}