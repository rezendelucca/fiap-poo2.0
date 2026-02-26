package br.com.fiapride.main;

import br.com.fiapride.model.FoneBluetooth;

public class SistemaDoFonePrincipal {
    public static void main(String[] args) {

        FoneBluetooth foneBluetooth1 = new FoneBluetooth();
        foneBluetooth1.foneConectado = true;
        foneBluetooth1.cargaBateria = 20;
        foneBluetooth1.caseAberta = false;
        foneBluetooth1.atenderChamada("Sim");
        foneBluetooth1.cancelarRuido(70);

        FoneBluetooth foneBluetooth2 = new FoneBluetooth();
        foneBluetooth2.foneConectado = true;
        foneBluetooth2.cargaBateria = 80;
        foneBluetooth2.caseAberta = false;
        foneBluetooth2.atenderChamada("Não");
        foneBluetooth2.cancelarRuido(50);

        System.out.println("--- Sistema Do Fone Principal ---");

        System.out.println("Fone do professor: V");
        System.out.println("O seu fone bluetooth tem " + foneBluetooth2.cargaBateria + "% de bateria, ele está conectado? " + foneBluetooth2.foneConectado + "\ne a case está aberta? " + foneBluetooth2.caseAberta + "\no seu fone necessita que cancele o ruído do fone? " + foneBluetooth2.cancelarRuido(70) + "\nVocê tem alguma ligação pendente no celular? " + foneBluetooth2.atenderChamada("Sim"));

        System.out.println("\nE o fone do aluno tem: V");
        System.out.println("O seu fone bluetooth tem " + foneBluetooth1.cargaBateria + "% de bateria, ele está conectado? " + foneBluetooth1.foneConectado + "\ne a case está aberta? " + foneBluetooth1.caseAberta + "\no seu fone necessita que cancele o ruído do fone? " + foneBluetooth1.cancelarRuido(50) + "\nVocê tem alguma ligação pendente no celular? " + foneBluetooth1.atenderChamada("Não"));
    }
}