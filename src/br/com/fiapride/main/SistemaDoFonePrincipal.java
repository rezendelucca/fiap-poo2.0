package br.com.fiapride.main;

import br.com.fiapride.model.FoneBluetooth;

public class SistemaDoFonePrincipal {

    public static void main(String[] args) {

        FoneBluetooth foneBluetooth1 = new FoneBluetooth(true, 40, false);
        FoneBluetooth foneBluetooth2 = new FoneBluetooth(false, 10, true);

        System.out.println("--- Sistema Do Fone Principal ---");

        System.out.println("\nFone do professor:");
        System.out.println(foneBluetooth1.verificarBateria());
        System.out.println("Está conectado? " + foneBluetooth1.getFoneConectado());
        System.out.println("Case aberta? " + foneBluetooth1.getCaseAberta());
        System.out.println("Cancelamento de ruído: " + foneBluetooth1.cancelarRuido(70));
        System.out.println("Ligação: " + foneBluetooth1.atenderChamada("Sim"));

        System.out.println("\nFone do aluno:");
        System.out.println(foneBluetooth2.verificarBateria());
        System.out.println("Está conectado? " + foneBluetooth2.getFoneConectado());
        System.out.println("Case aberta? " + foneBluetooth2.getCaseAberta());
        System.out.println("Cancelamento de ruído: " + foneBluetooth2.cancelarRuido(70));
        System.out.println("Ligação: " + foneBluetooth2.atenderChamada("Não"));
    }
}