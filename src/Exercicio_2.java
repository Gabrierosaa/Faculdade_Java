import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("===============");
            System.out.println("1 - Atendimento");
            System.out.println("2 - Consulta");
            System.out.println("3 - Segunda via");
            System.out.println("0 - Sair");
            System.out.println("===============");
            System.out.print("Selecione sua opcao: ");

            opcao = teclado.nextInt();

            if (opcao > 3 || opcao < 0) {
                System.out.println("Opcao invalida!");
            }          

            System.out.println(); 
            switch (opcao) {
                case 1:
                    System.out.println("Atendimento selecionado");
                    break;
                case 2:
                    System.out.println("Consulta selecionada");
                    break;
                case 3:
                    System.out.println("Segunda via selecionada");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;               
            }
        } while (opcao != 0);


        teclado.close();  
    }
}
