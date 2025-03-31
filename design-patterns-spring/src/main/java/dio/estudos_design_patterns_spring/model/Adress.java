package dio.estudos_design_patterns_spring.model;

import jakarta.persistence.*;

@Entity
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    private Adress endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Adress getEndereco() {
        return endereco;
    }

    public void setEndereco(Adress endereco) {
        this.endereco = endereco;
    }
}
