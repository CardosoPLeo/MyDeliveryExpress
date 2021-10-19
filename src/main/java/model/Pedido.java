package model;

import java.util.Date;
import java.util.List;

public class Pedido {
    private Integer idPedido;
    private Integer numeroPedido;
    private Date dataPedido;
    private Date horaPedido;
    private String formaDePagamento;
    private Boolean delivery;
    private Boolean pago;
    private List<Cliente> cliente;
    private List<Item>item;

    public Pedido() {
        super();
    }

    public Pedido(Integer idPedido, Integer numeroPedido, Date dataPedido, Date horaPedido, String formaDePagamento, Boolean delivery, Boolean pago, List<Cliente> cliente, List<Item> item) {
        this.idPedido = idPedido;
        this.numeroPedido = numeroPedido;
        this.dataPedido = dataPedido;
        this.horaPedido = horaPedido;
        this.formaDePagamento = formaDePagamento;
        this.delivery = delivery;
        this.pago = pago;
        this.cliente = cliente;
        this.item = item;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(Date horaPedido) {
        this.horaPedido = horaPedido;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
