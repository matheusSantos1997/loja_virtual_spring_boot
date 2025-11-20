package jdev.mentoria.lojavirtual.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
import jdev.mentoria.lojavirtual.enums.StatusContaPagar;

@Entity
@Table(name = "conta_pagar")
@SequenceGenerator(name = "seq_conta_pagar", sequenceName = "seq_conta_pagar", allocationSize = 1, initialValue = 1)
public class ContaPagar {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_pagar")
    private Long id;

    private String descricao;

    private BigDecimal valorTotal;

    private BigDecimal valorDesconto;
    
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;
    
    @Temporal(TemporalType.DATE)
    private Date dtPagamento;

    @Enumerated(EnumType.STRING)
    private StatusContaPagar statusContaPagar;

    @ManyToOne(targetEntity = PessoaFisica.class)
    @JoinColumn(name = "pessoa_fisica_id", nullable = true, foreignKey = 
    @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fisica_fk"))
    private PessoaFisica pessoaFisica;
     
    @ManyToOne(targetEntity = PessoaJuridica.class)
    @JoinColumn(name = "pessoa_juridica_id", nullable = true, foreignKey =
    @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_juridica_fk"))
    private PessoaJuridica pessoaJuridica;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Date getDtVencimento() {
        return this.dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Date getDtPagamento() {
        return this.dtPagamento;
    }

    public void setDtPagamento(Date dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public StatusContaPagar getStatusContaPagar() {
        return this.statusContaPagar;
    }

    public void setStatusContaPagar(StatusContaPagar statusContaPagar) {
        this.statusContaPagar = statusContaPagar;
    }

    public PessoaFisica getPessoaFisica() {
        return this.pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return this.pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContaPagar that = (ContaPagar) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
  
}
