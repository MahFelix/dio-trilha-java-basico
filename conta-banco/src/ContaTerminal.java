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


        System.out.println("Deseja solicitar saque?");
        double valorSolicitado = scanner.nextDouble();

        double NovoSaldo = saldo;


        if( valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;
        System.out.println("seu saldo agora é de: " + NovoSaldo );
       }else
        System.out.println("Saldo insuficiente");

        // OU CONDIÇÃO TERNÁRIA ABAIXO:

        // double novoSaldo = (valorSolicitado < saldo) ? saldo - valorSolicitado : saldo;
        // String mensagem = (valorSolicitado < saldo) ? "Seu saldo agora é de: " + novoSaldo : "Saldo insuficiente";
 
        // System.out.println(mensagem);

        
      
      
        scanner.close();
 
    }
}
