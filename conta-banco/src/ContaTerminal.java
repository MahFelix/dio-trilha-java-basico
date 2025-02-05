import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    // TODO: Conhecer e importar a classe Scanner
    // Exibir as mensagens para o nosso usuário
    //Obter pela scanner os valores digitados no terminal
    //Exibir a Mensagem conta criada

        String cliente = "Maria Roberta";
        double saldo = 550.54;

        System.out.println("Digite o numéro da Agencia");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

    

        System.out.println("Prezado(a)," + cliente + " Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque");

      
        scanner.close();
 


    }
}
