package ExercicioSalario;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Salario {
    public static void main (String[] args){
        double salarioMinimo = 1212.00;
        Scanner entradaUsuario = new Scanner(System.in);

            System.out.println("Digite o seu salário: ");
            double salarioUsuario = entradaUsuario.nextDouble();
            double quantidadeSalarios = salarioUsuario / salarioMinimo;
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

            System.out.println("Você recebe " + decimalFormat.format(quantidadeSalarios) + " salários mínimos.");
    }
}
