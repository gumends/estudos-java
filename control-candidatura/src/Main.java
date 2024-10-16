//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        analizarCandidato(1900.0);
        analizarCandidato(2200.0);
        analizarCandidato(2000.0);
    }

    public static void analizarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioPretendido > salarioBase) {
            System.out.println("Ligar para o candidadto");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidadto com contra proposta");
        } else {
            System.out.println("Aguardar os resultados dos demais candidatos");
        }
    }
}