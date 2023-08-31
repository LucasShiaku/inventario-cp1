package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_NOME", uniqueConstraints = {
        @UniqueConstraint(name = "UK_TIPO_BEM", columnNames = "NM_TIPOBEM")
})
public class TipoDeBem {
    @Id
    @Column(name = "ID_TIPOBEM")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_TIPOBEM")
    private Long id;

    @Column(name ="NM_TIPOBEM", nullable = false)
    private String nome;

    public TipoDeBem() {
    }

    public TipoDeBem(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public TipoDeBem setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoDeBem setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "TipoDeBem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
