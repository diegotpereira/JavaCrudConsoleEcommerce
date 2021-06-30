package br.com.java.model;

public class Venda {
	
	private Integer idVenda;
	private String data;
	private String nomeComprador;
	private String cartaoComprador;
	private String codSegurancaComprador;
	private Double valor;
	private Integer idProduto;

	

    /**
     * @return Integer return the idVenda
     */
    public Integer getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    /**
     * @return String return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return String return the nomeComprador
     */
    public String getNomeComprador() {
        return nomeComprador;
    }

    /**
     * @param nomeComprador the nomeComprador to set
     */
    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    /**
     * @return String return the cartaoComprador
     */
    public String getCartaoComprador() {
        return cartaoComprador;
    }

    /**
     * @param cartaoComprador the cartaoComprador to set
     */
    public void setCartaoComprador(String cartaoComprador) {
        this.cartaoComprador = cartaoComprador;
    }

    /**
     * @return String return the codSegurancaComprador
     */
    public String getCodSegurancaComprador() {
        return codSegurancaComprador;
    }

    /**
     * @param codSegurancaComprador the codSegurancaComprador to set
     */
    public void setCodSegurancaComprador(String codSegurancaComprador) {
        this.codSegurancaComprador = codSegurancaComprador;
    }

    /**
     * @return Double return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return Integer return the idProduto
     */
    public Integer getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

	public Venda(Integer idVenda, String data, String nomeComprador, String cartaoComprador,
			String codSegurancaComprador, Double valor, Integer idProduto) {
		
		this.idVenda = idVenda;
		this.data = data;
		this.nomeComprador = nomeComprador;
		this.cartaoComprador = cartaoComprador;
		this.codSegurancaComprador = codSegurancaComprador;
		this.valor = valor;
		this.idProduto = idProduto;
	}

	@Override
	public String toString() {
		return "Venda [idVenda=" + idVenda + ", data=" + data + ", nomeComprador=" + nomeComprador
				+ ", cartaoComprador=" + cartaoComprador + ", codSegurancaComprador=" + codSegurancaComprador
				+ ", valor=" + valor + ", idProduto=" + idProduto + "]";
	}
}
