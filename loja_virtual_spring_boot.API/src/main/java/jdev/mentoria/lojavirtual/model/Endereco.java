package jdev.mentoria.lojavirtual.model;

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
import jdev.mentoria.lojavirtual.enums.TipoEndereco;

@Entity
@Table(name = "endereco")
@SequenceGenerator(name = "seq_endereco", sequenceName = "seq_endereco", allocationSize = 1, initialValue = 1)
public class Endereco {
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_endereco")
     private Long id;

     private String ruaLogra;

     private String cep;

     private String numero;

     private String complemento;

     private String bairro;

     private String uf;

     private String cidade;
     
     @ManyToOne(targetEntity = PessoaFisica.class)
     @JoinColumn(name = "pessoa_fisica_id", nullable = true, foreignKey = 
     @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fisica_fk"))
     private PessoaFisica pessoaFisica;
     
     @ManyToOne(targetEntity = PessoaJuridica.class)
     @JoinColumn(name = "pessoa_juridica_id", nullable = true, foreignKey =
     @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_juridica_fk"))
     private PessoaJuridica pessoaJuridica;
     
     @Enumerated(EnumType.STRING)
     private TipoEndereco tipoEndereco;

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }
    
    public void setTipoEndereco(TipoEndereco tipoEndereco){
        this.tipoEndereco = tipoEndereco;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuaLogra() {
        return this.ruaLogra;
    }

    public void setRuaLogra(String ruaLogra) {
        this.ruaLogra = ruaLogra;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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
        Endereco endereco = (Endereco) o;
        return Objects.equals(id, endereco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
