package DTO;

public class ServicoDTO {

    private int id_servico;
    private String descricao_servico;
    private String observacao_servico;
    private Double valor_servico;

    public int getId_servico() {
        return id_servico;
    }

    public String getDescricao_servico() {
        return descricao_servico;
    }

    public String getObservacao_servico() {
        return observacao_servico;
    }

    public Double getValor_servico() {
        return valor_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public void setDescricao_servico(String descricao_servico) {
        this.descricao_servico = descricao_servico;
    }

    public void setObservacao_servico(String observacao_servico) {
        this.observacao_servico = observacao_servico;
    }

    public void setValor_servico(Double valor_servico) {
        this.valor_servico = valor_servico;
    }
    
    
    
}
