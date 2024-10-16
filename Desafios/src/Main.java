
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float salario = leitura.nextFloat();
        float beneficios = leitura.nextFloat();
        calculoSalarial(salario, beneficios);
    }

    static void calculoSalarial(float salario, float beneficios) {
        float conta;
        if (salario <= 1100) {
            conta = salario - (salario * 0.05f);
        } else if (salario > 1100 && salario <= 2500){
            conta = salario - (salario * 0.10f);
        } else {
            conta = salario - (salario * 0.15f);
        }
        float resultadoFinal = conta + beneficios;
        System.out.println(resultadoFinal);
    }
}