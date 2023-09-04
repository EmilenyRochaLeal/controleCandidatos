//import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // analisarCandidato(1500.0);
        // analisarCandidato(2000);
        // analisarCandidato(3400);
        selecionarCandidato();
    }
    static void  selecionarCandidato(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOSEPHE"};
        int candidatoSelecionado = 0;
        int candidatosAtual = 0 ;
        double salarioBase = 2000.00;
        while (candidatoSelecionado < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido + " de salário.");

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                System.out.println("");
                candidatoSelecionado++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void  analisarCandidato(double pretencaoSalarial){
        double salarioBase = 2000.00;
        if (salarioBase > pretencaoSalarial ){
            System.out.println("Ligar para Candidato! ");
        }
        else if (salarioBase == pretencaoSalarial){
            System.out.println("Ligar para o candidato com contra proposta! ");
        }
        else {
            System.out.println("Aguardando outros candidatos");
        }
    }
}
