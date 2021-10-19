package model;

public class Item extends Produto{
    private Integer idItem;
    private Integer quantidade;
    public Item(String nome, Double precoUnitario) {
        super(nome, precoUnitario);
    }

    public Item() {
        super();
    }

    public Item(String nome, Double precoUnitario, Integer idItem, Integer quantidade) {
        super(nome, precoUnitario);
        this.idItem = idItem;
        this.quantidade = quantidade;
    }

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
