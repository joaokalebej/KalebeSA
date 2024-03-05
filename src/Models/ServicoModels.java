package Models;

public class ServicoModels {

    private int id;
    private String descricao;
    private double valor;
    
    public ServicoModels(int id, String descricao, Double valor){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    //-------->GET & SET<--------
    
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
