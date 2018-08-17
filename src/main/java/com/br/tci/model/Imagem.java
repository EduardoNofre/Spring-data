package com.br.tci.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;


/**
 * The persistent class for the imagem database table.
 * 
 */
@Entity
@Table(name="imagem")
@NamedQuery(name="Imagem.findAll", query="SELECT i FROM Imagem i")
public class Imagem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_imagem")
	private Integer idImagem;

	@Column(name="arquivo_original")
	private Boolean arquivoOriginal;

	private String arquivofinal;

	private Integer auditada;

	private Integer blockChain;

	private String caminhoarquivofinal;

	private String caminhoimagem;

	@Column(name="data_processamento_ocr")
	private Timestamp dataProcessamentoOcr;

	private Time datacriacao;

	@Column(name="erro_ocr")
	private Integer erroOcr;

	@Column(name="erro_vrs")
	private String erroVrs;

	private Integer excluida;

	@Column(name="id_documento")
	private Integer idDocumento;

	@Column(name="id_imagem_pai")
	private Integer idImagemPai;

	@Column(name="id_motivo_reprovacao")
	private Integer idMotivoReprovacao;

	@Column(name="id_origem")
	private Integer idOrigem;

	@Column(name="id_repositorio")
	private BigDecimal idRepositorio;

	private String nmimagem;

	private String observacao;

	private Boolean ocr;

	private Integer ordem;

	private Integer paginas;

	private Boolean rejeitada;

	@Column(name="reprocessamento_ocr")
	private Integer reprocessamentoOcr;

	private String tamanhoimagem;

	@Column(name="tipo_ocr")
	private String tipoOcr;

	private BigDecimal versao;

	private Boolean visitada;

	private Boolean vrs;

	@Column(name="zona_ocr")
	private Integer zonaOcr;

	public Imagem() {
	}

	public Integer getIdImagem() {
		return this.idImagem;
	}

	public void setIdImagem(Integer idImagem) {
		this.idImagem = idImagem;
	}

	public Boolean getArquivoOriginal() {
		return this.arquivoOriginal;
	}

	public void setArquivoOriginal(Boolean arquivoOriginal) {
		this.arquivoOriginal = arquivoOriginal;
	}

	public String getArquivofinal() {
		return this.arquivofinal;
	}

	public void setArquivofinal(String arquivofinal) {
		this.arquivofinal = arquivofinal;
	}

	public Integer getAuditada() {
		return this.auditada;
	}

	public void setAuditada(Integer auditada) {
		this.auditada = auditada;
	}

	public Integer getBlockChain() {
		return this.blockChain;
	}

	public void setBlockChain(Integer blockChain) {
		this.blockChain = blockChain;
	}

	public String getCaminhoarquivofinal() {
		return this.caminhoarquivofinal;
	}

	public void setCaminhoarquivofinal(String caminhoarquivofinal) {
		this.caminhoarquivofinal = caminhoarquivofinal;
	}

	public String getCaminhoimagem() {
		return this.caminhoimagem;
	}

	public void setCaminhoimagem(String caminhoimagem) {
		this.caminhoimagem = caminhoimagem;
	}

	public Timestamp getDataProcessamentoOcr() {
		return this.dataProcessamentoOcr;
	}

	public void setDataProcessamentoOcr(Timestamp dataProcessamentoOcr) {
		this.dataProcessamentoOcr = dataProcessamentoOcr;
	}

	public Time getDatacriacao() {
		return this.datacriacao;
	}

	public void setDatacriacao(Time datacriacao) {
		this.datacriacao = datacriacao;
	}

	public Integer getErroOcr() {
		return this.erroOcr;
	}

	public void setErroOcr(Integer erroOcr) {
		this.erroOcr = erroOcr;
	}

	public String getErroVrs() {
		return this.erroVrs;
	}

	public void setErroVrs(String erroVrs) {
		this.erroVrs = erroVrs;
	}

	public Integer getExcluida() {
		return this.excluida;
	}

	public void setExcluida(Integer excluida) {
		this.excluida = excluida;
	}

	public Integer getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getIdImagemPai() {
		return this.idImagemPai;
	}

	public void setIdImagemPai(Integer idImagemPai) {
		this.idImagemPai = idImagemPai;
	}

	public Integer getIdMotivoReprovacao() {
		return this.idMotivoReprovacao;
	}

	public void setIdMotivoReprovacao(Integer idMotivoReprovacao) {
		this.idMotivoReprovacao = idMotivoReprovacao;
	}

	public Integer getIdOrigem() {
		return this.idOrigem;
	}

	public void setIdOrigem(Integer idOrigem) {
		this.idOrigem = idOrigem;
	}

	public BigDecimal getIdRepositorio() {
		return this.idRepositorio;
	}

	public void setIdRepositorio(BigDecimal idRepositorio) {
		this.idRepositorio = idRepositorio;
	}

	public String getNmimagem() {
		return this.nmimagem;
	}

	public void setNmimagem(String nmimagem) {
		this.nmimagem = nmimagem;
	}

	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean getOcr() {
		return this.ocr;
	}

	public void setOcr(Boolean ocr) {
		this.ocr = ocr;
	}

	public Integer getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public Integer getPaginas() {
		return this.paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public Boolean getRejeitada() {
		return this.rejeitada;
	}

	public void setRejeitada(Boolean rejeitada) {
		this.rejeitada = rejeitada;
	}

	public Integer getReprocessamentoOcr() {
		return this.reprocessamentoOcr;
	}

	public void setReprocessamentoOcr(Integer reprocessamentoOcr) {
		this.reprocessamentoOcr = reprocessamentoOcr;
	}

	public String getTamanhoimagem() {
		return this.tamanhoimagem;
	}

	public void setTamanhoimagem(String tamanhoimagem) {
		this.tamanhoimagem = tamanhoimagem;
	}

	public String getTipoOcr() {
		return this.tipoOcr;
	}

	public void setTipoOcr(String tipoOcr) {
		this.tipoOcr = tipoOcr;
	}

	public BigDecimal getVersao() {
		return this.versao;
	}

	public void setVersao(BigDecimal versao) {
		this.versao = versao;
	}

	public Boolean getVisitada() {
		return this.visitada;
	}

	public void setVisitada(Boolean visitada) {
		this.visitada = visitada;
	}

	public Boolean getVrs() {
		return this.vrs;
	}

	public void setVrs(Boolean vrs) {
		this.vrs = vrs;
	}

	public Integer getZonaOcr() {
		return this.zonaOcr;
	}

	public void setZonaOcr(Integer zonaOcr) {
		this.zonaOcr = zonaOcr;
	}

}