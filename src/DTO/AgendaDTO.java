package DTO;

public class AgendaDTO {

    private int id_agenda;
    private String observacao_agenda;
    private String data_agenda;
    private String hora_agenda;
    private Double valor_agenda;
    private String opcaoCliente_agenda;
    private String opcaoServico_agenda;

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public String getObservacao_agenda() {
        return observacao_agenda;
    }

    public String getData_agenda() {
        return data_agenda;
    }

    public String getHora_agenda() {
        return hora_agenda;
    }

    public Double getValor_agenda() {
        return valor_agenda;
    }

    public String getOpcaoCliente_agenda() {
        return opcaoCliente_agenda;
    }

    public String getOpcaoServico_agenda() {
        return opcaoServico_agenda;
    }

    public void setObservacao_agenda(String observacao_agenda) {
        this.observacao_agenda = observacao_agenda;
    }

    public void setData_agenda(String data_agenda) {
        this.data_agenda = data_agenda;
    }

    public void setHora_agenda(String hora_agenda) {
        this.hora_agenda = hora_agenda;
    }

    public void setValor_agenda(Double valor_agenda) {
        this.valor_agenda = valor_agenda;
    }

    public void setOpcaoCliente_agenda(String opcaoCliente_agenda) {
        this.opcaoCliente_agenda = opcaoCliente_agenda;
    }

    public void setOpcaoServico_agenda(String opcaoServico_agenda) {
        this.opcaoServico_agenda = opcaoServico_agenda;
    }
    
}
