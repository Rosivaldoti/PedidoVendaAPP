package br.com.adsddm.pedidovenda.model;

/**
 * Created by Daniel on 24/05/2017.
 */

public class ItemPedidoVenda {
    private long id;
    private PedidoVenda pedidovenda;
    private Produto produto;
    private int qtd;

    public ItemPedidoVenda() {
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public PedidoVenda getPedidovenda() {
        return this.pedidovenda;
    }
    public void setPedidovenda(PedidoVenda pedidovenda) {
        this.pedidovenda = pedidovenda;
    }
    public Produto getProduto() {
        return this.produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
