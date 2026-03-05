package br.com.fiapride.model;

public class FoneBluetooth {

    private boolean foneConectado;
    private double cargaBateria;
    private boolean caseAberta;

    public FoneBluetooth(boolean foneConectado, double cargaBateria, boolean caseAberta) {
        this.setFoneConectado(foneConectado);
        this.setCargaBateria(cargaBateria);
        this.caseAberta = caseAberta;
    }

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

    public boolean getFoneConectado() {
        return this.foneConectado;
    }

    private void setFoneConectado(boolean conectado) {
        if (conectado) {
            this.foneConectado = true;
        } else {
            System.out.println("O fone não está conectado.");
            this.foneConectado = false;
        }
    }

    public double getCargaBateria() {
        return this.cargaBateria;
    }

    private void setCargaBateria(double carregamento) {
        this.cargaBateria = carregamento;
    }

    public boolean getCaseAberta() {
        return this.caseAberta;
    }

    public String verificarBateria() {
        if (cargaBateria < 20) {
            return "O fone está com " + cargaBateria + "% de bateria e necessita carregar.";
        } else {
            return "O fone está com " + cargaBateria + "% de bateria e não necessita de carregamento.";
        }
    }
}