import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String servico = scanner.nextLine().trim();

        String entradaCliente = scanner.nextLine().trim();

        String[] partes = entradaCliente.split(",");
        boolean contratado = false;

        for (int i = 1; i < partes.length; i++) {
            String parte = partes[i];
            if(parte.equals(servico)){
                contratado = true;
                break;
            }
        }
        System.out.println(contratado ? "Sim" : "Não");
        scanner.close();
    }
}