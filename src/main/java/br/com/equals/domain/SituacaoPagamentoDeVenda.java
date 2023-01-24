package br.com.equals.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class SituacaoPagamentoDeVenda  {
	private String situacao;
	private String confirmacaoPagamento;
	private String situacaoConciliacao;
	private Long numeroLote;
	private Long numeroLoteUnico;
	private Long idEstabelecimento;
	private String cnpj;
	private String codigoEstabelecimento;
	private String nomeFantasia;
	private Long idAdquirente;
	private String nomeAdquirente;
	private String idFormaPagamento;
	private String nomeFormaPagamento;
	private String parcela;
	private String numeroAutorizacao;
	private Long numeroNSU;
	private String numeroTID;
	private String numeroPedido;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataTransacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
	private LocalDateTime horaTransacao;
	private BigDecimal valorParcela;
	private BigDecimal valorPagamentoPrevisto;
	private BigDecimal valorComissao;
	private BigDecimal taxaDesconto;
	private BigDecimal valorLiquido;
	private BigDecimal valorPago;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataPrevisaoPagamento;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataPagamentoRealizado;
	private String informacaoAdicional1;
	private String informacaoAdicional2;
	private String informacaoAdicional3;
	private String informacaoAdicional4;


	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getConfirmacaoPagamento() {
		return confirmacaoPagamento;
	}

	public void setConfirmacaoPagamento(String confirmacaoPagamento) {
		this.confirmacaoPagamento = confirmacaoPagamento;
	}

	public String getSituacaoConciliacao() {
		return situacaoConciliacao;
	}

	public void setSituacaoConciliacao(String situacaoConciliacao) {
		this.situacaoConciliacao = situacaoConciliacao;
	}

	public Long getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(Long numeroLote) {
		this.numeroLote = numeroLote;
	}

	public Long getNumeroLoteUnico() {
		return numeroLoteUnico;
	}

	public void setNumeroLoteUnico(Long numeroLoteUnico) {
		this.numeroLoteUnico = numeroLoteUnico;
	}

	public Long getIdEstabelecimento() {
		return idEstabelecimento;
	}

	public void setIdEstabelecimento(Long idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCodigoEstabelecimento() {
		return codigoEstabelecimento;
	}

	public void setCodigoEstabelecimento(String codigoEstabelecimento) {
		this.codigoEstabelecimento = codigoEstabelecimento;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Long getIdAdquirente() {
		return idAdquirente;
	}

	public void setIdAdquirente(Long idAdquirente) {
		this.idAdquirente = idAdquirente;
	}

	public String getNomeAdquirente() {
		return nomeAdquirente;
	}

	public void setNomeAdquirente(String nomeAdquirente) {
		this.nomeAdquirente = nomeAdquirente;
	}

	public String getIdFormaPagamento() {
		return idFormaPagamento;
	}

	public void setIdFormaPagamento(String idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}

	public String getNomeFormaPagamento() {
		return nomeFormaPagamento;
	}

	public void setNomeFormaPagamento(String nomeFormaPagamento) {
		this.nomeFormaPagamento = nomeFormaPagamento;
	}

	public String getParcela() {
		return parcela;
	}

	public void setParcela(String parcela) {
		this.parcela = parcela;
	}

	public String getNumeroAutorizacao() {
		return numeroAutorizacao;
	}

	public void setNumeroAutorizacao(String numeroAutorizacao) {
		this.numeroAutorizacao = numeroAutorizacao;
	}

	public Long getNumeroNSU() {
		return numeroNSU;
	}

	public void setNumeroNSU(Long numeroNSU) {
		this.numeroNSU = numeroNSU;
	}

	public String getNumeroTID() {
		return numeroTID;
	}

	public void setNumeroTID(String numeroTID) {
		this.numeroTID = numeroTID;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public LocalDate getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(LocalDate dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public LocalDateTime getHoraTransacao() {
		return horaTransacao;
	}

	public void setHoraTransacao(LocalDateTime horaTransacao) {
		this.horaTransacao = horaTransacao;
	}

	public BigDecimal getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}

	public BigDecimal getValorPagamentoPrevisto() {
		return valorPagamentoPrevisto;
	}

	public void setValorPagamentoPrevisto(BigDecimal valorPagamentoPrevisto) {
		this.valorPagamentoPrevisto = valorPagamentoPrevisto;
	}

	public BigDecimal getValorComissao() {
		return valorComissao;
	}

	public void setValorComissao(BigDecimal valorComissao) {
		this.valorComissao = valorComissao;
	}

	public BigDecimal getTaxaDesconto() {
		return taxaDesconto;
	}

	public void setTaxaDesconto(BigDecimal taxaDesconto) {
		this.taxaDesconto = taxaDesconto;
	}

	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(BigDecimal valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public LocalDate getDataPrevisaoPagamento() {
		return dataPrevisaoPagamento;
	}

	public void setDataPrevisaoPagamento(LocalDate dataPrevisaoPagamento) {
		this.dataPrevisaoPagamento = dataPrevisaoPagamento;
	}

	public LocalDate getDataPagamentoRealizado() {
		return dataPagamentoRealizado;
	}

	public void setDataPagamentoRealizado(LocalDate dataPagamentoRealizado) {
		this.dataPagamentoRealizado = dataPagamentoRealizado;
	}

	public String getInformacaoAdicional1() {
		return informacaoAdicional1;
	}

	public void setInformacaoAdicional1(String informacaoAdicional1) {
		this.informacaoAdicional1 = informacaoAdicional1;
	}

	public String getInformacaoAdicional2() {
		return informacaoAdicional2;
	}

	public void setInformacaoAdicional2(String informacaoAdicional2) {
		this.informacaoAdicional2 = informacaoAdicional2;
	}

	public String getInformacaoAdicional3() {
		return informacaoAdicional3;
	}

	public void setInformacaoAdicional3(String informacaoAdicional3) {
		this.informacaoAdicional3 = informacaoAdicional3;
	}

	public String getInformacaoAdicional4() {
		return informacaoAdicional4;
	}

	public void setInformacaoAdicional4(String informacaoAdicional4) {
		this.informacaoAdicional4 = informacaoAdicional4;
	}
}
