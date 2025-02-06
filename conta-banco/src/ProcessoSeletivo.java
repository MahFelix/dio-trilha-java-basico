
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
    }

    static void imprimirSelecionado() {
        String [] candidatos = {"FELIPE", "MARICA", "JULIA", "PAULO", "", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato nº " + (indice+1) + "é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for(String candidato: candidatos ){
            System.out.println("O candidato selecionado foi: "+ candidato);
        }
    }

    static void selecaoCandidato(){
        String [] candidatos = {"FELIPE", "MARIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato " + candidato + " Solicitou este valor de salário" + salarioPretendido);
            if(salarioBase > salarioPretendido){
                System.out.println("O Candidato " + candidato + " foi selecionado para a vaga" );
                candidatosSelecionados++;

            }
            candidatoAtual++;
        }
    }


    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
            
    }
}
