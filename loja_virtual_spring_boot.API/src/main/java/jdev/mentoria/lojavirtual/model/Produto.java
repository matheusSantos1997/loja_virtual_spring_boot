package jdev.mentoria.lojavirtual.model;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
    private Long id; 
    
    private String tipoUnidade;
    
    private String nome;

    private Boolean ativo = Boolean.TRUE;
    
    @Column(columnDefinition = "text", length = 2000)
    private String descricao;

    /** item nota produto - ASSOCIAR **/

    private Double peso;

    private Double largura;

    private Double altura;

    private Double profundidade;

    private BigDecimal valorVenda = BigDecimal.ZERO;

    private Integer qtdEstoque = 0;

    private Integer qtdeAlertaEstoque = 0;

    private String linkYouTube;

    private Boolean alertaQtdeEstoque = Boolean.FALSE;

    private Integer qtdeClique = 0;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoUnidade() {
        return this.tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getLargura() {
        return this.largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return this.altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getProfundidade() {
        return this.profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    public BigDecimal getValorVenda() {
        return this.valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getQtdEstoque() {
        return this.qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Integer getQtdeAlertaEstoque() {
        return this.qtdeAlertaEstoque;
    }

    public void setQtdeAlertaEstoque(Integer qtdeAlertaEstoque) {
        this.qtdeAlertaEstoque = qtdeAlertaEstoque;
    }

    public String getLinkYouTube() {
        return this.linkYouTube;
    }

    public void setLinkYouTube(String linkYouTube) {
        this.linkYouTube = linkYouTube;
    }

    public Boolean isAlertaQtdeEstoque() {
        return this.alertaQtdeEstoque;
    }

    public Boolean getAlertaQtdeEstoque() {
        return this.alertaQtdeEstoque;
    }

    public void setAlertaQtdeEstoque(Boolean alertaQtdeEstoque) {
        this.alertaQtdeEstoque = alertaQtdeEstoque;
    }

    public Integer getQtdeClique() {
        return this.qtdeClique;
    }

    public void setQtdeClique(Integer qtdeClique) {
        this.qtdeClique = qtdeClique;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto that = (Produto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}