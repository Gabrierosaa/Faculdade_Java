import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o numero: ");
        num = scan.nextInt();

        int i = 0;
        while(i <= 10){
            System.out.printf("%d x %d = %d%n", num, i, num * i);
            i++;
        }

        scan.close();
    }
}
