package jdev.mentoria.lojavirtual.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "nota_fiscal_compra")
@SequenceGenerator(name = "seq_nota_fiscal_compra", sequenceName = "seq_nota_fiscal_compra", allocationSize = 1, initialValue = 1)
public class NotaFiscalCompra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota_fiscal_compra")
    private Long id;

    private String numeroNota;

    private String serieNota;

    private String descricaoObs;

    private BigDecimal valorTotal;

    private BigDecimal valorDesconto;

    private BigDecimal valorIcms;
    
    @Temporal(TemporalType.DATE)
    private Date dataCompra;

    @ManyToOne(targetEntity = PessoaFisica.class)
    @JoinColumn(name = "pessoa_fisica_id", nullable = false, foreignKey = 
    @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fisica_fk"))
    private PessoaFisica pessoaFisica;

     @ManyToOne(targetEntity = ContaPagar.class)
     @JoinColumn(name = "conta_pagar_id", nullable = false, foreignKey = 
     @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "conta_pagar_fk"))
     private ContaPagar contaPagar;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroNota() {
        return this.numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getSerieNota() {
        return this.serieNota;
    }

    public void setSerieNota(String serieNota) {
        this.serieNota = serieNota;
    }

    public String getDescricaoObs() {
        return this.descricaoObs;
    }

    public void setDescricaoObs(String descricaoObs) {
        this.descricaoObs = descricaoObs;
    }

    public BigDecimal getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorDesconto() {
        return this.valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorIcms() {
        return this.valorIcms;
    }

    public void setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
    }

    public Date getDataCompra() {
        return this.dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public PessoaFisica getPessoaFisica() {
        return this.pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public ContaPagar getContaPagar() {
        return this.contaPagar;
    }

    public void setContaPagar(ContaPagar contaPagar) {
        this.contaPagar = contaPagar;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscalCompra that = (NotaFiscalCompra) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
