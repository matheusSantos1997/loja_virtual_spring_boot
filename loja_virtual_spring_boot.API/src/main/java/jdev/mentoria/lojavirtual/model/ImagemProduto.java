package jdev.mentoria.lojavirtual.model;

import java.util.Objects;

import jakarta.persistence.Column;
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

@Entity
@Table(name = "imagem_produto")
@SequenceGenerator(name = "seq_imagem_produto", sequenceName = "seq_imagem_produto", allocationSize = 1, initialValue = 1)
public class ImagemProduto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_imagem_produto")
    private Long id;
    
    @Column(columnDefinition = "text")
    private String imagemOriginal;
    
    @Column(columnDefinition = "text")
    private String imagemMiniatura;
    
    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false, 
    foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
    private Produto produto;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagemOriginal() {
        return this.imagemOriginal;
    }

    public void setImagemOriginal(String imagemOriginal) {
        this.imagemOriginal = imagemOriginal;
    }

    public String getImagemMiniatura() {
        return this.imagemMiniatura;
    }

    public void setImagemMiniatura(String imagemMiniatura) {
        this.imagemMiniatura = imagemMiniatura;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ImagemProduto that = (ImagemProduto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
