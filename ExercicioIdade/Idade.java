package ExercicioIdade;

import java.util.Scanner;

public class Idade {
    public static void main (String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Digite a sua idade em anos: ");
        int idadeAnos = entradaUsuario.nextInt();
        System.out.println("Digite a sua idade em meses: ");
        int idadeMeses = entradaUsuario.nextInt();

//        int idadeAosEmDiasn = idadeAnos * 365;
//        int idadeMesesEmDias = idadeMeses * 30;
        int idadeTotalEmDias = (idadeAnos * 365) + (idadeMeses *30);

        System.out.println("Você tem " + idadeAnos + " anos");
        System.out.println(idadeMeses + " mes(es)");
        System.out.println("Você viveu o total de " + idadeTotalEmDias + " dias.");


    }

}
