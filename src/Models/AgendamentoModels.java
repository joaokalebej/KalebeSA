package Models;

import java.util.Date;

public class AgendamentoModels {

    private int id;
    private Double valor;
    private String dataHora;
    private String observacao;
    
    public AgendamentoModels (int id, Double valor, String dataHora, String observacao){
        this.id = id;
        this.valor = valor;
        this.dataHora = dataHora;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public String getDataHora() {
        return dataHora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
}
