package br.com.fiapride.model;

public class FoneBluetooth {

    public boolean foneConectado;
    public int cargaBateria;
    public boolean caseAberta;

    public String atenderChamada(String ligacao) {
        if (ligacao.equals("Sim")) {
            return "Sim, atendendo a ligação...";
        } else {
            return "Seu celular não está tocando.";
        }
    }

    public String cancelarRuido(int decibeis) {
        if (decibeis >= 70) {
            return "Sim, cancelamento ativado.";
        } else {
            return "Não é necessário cancelar ruído.";
        }
    }
}