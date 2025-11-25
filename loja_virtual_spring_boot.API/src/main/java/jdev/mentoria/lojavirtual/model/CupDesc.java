package jdev.mentoria.lojavirtual.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "cup_desc")
@SequenceGenerator(name = "seq_cup_desc", sequenceName = "seq_cup_desc", allocationSize = 1, initialValue = 1)
public class CupDesc {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cup_desc")
    private Long id;

    private String codDesc;

    private BigDecimal valorRealDesc;

    private BigDecimal valorPorcentDesc;

    @Temporal(TemporalType.DATE)
    private Date dataValidadedeCupom;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodDesc() {
        return this.codDesc;
    }

    public void setCodDesc(String codDesc) {
        this.codDesc = codDesc;
    }

    public BigDecimal getValorRealDesc() {
        return this.valorRealDesc;
    }

    public void setValorRealDesc(BigDecimal valorRealDesc) {
        this.valorRealDesc = valorRealDesc;
    }

    public BigDecimal getValorPorcentDesc() {
        return this.valorPorcentDesc;
    }

    public void setValorPorcentDesc(BigDecimal valorPorcentDesc) {
        this.valorPorcentDesc = valorPorcentDesc;
    }

    public Date getDataValidadedeCupom() {
        return this.dataValidadedeCupom;
    }

    public void setDataValidadedeCupom(Date dataValidadedeCupom) {
        this.dataValidadedeCupom = dataValidadedeCupom;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CupDesc that = (CupDesc) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
