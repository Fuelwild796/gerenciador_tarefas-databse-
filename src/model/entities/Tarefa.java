package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Tarefa implements Serializable {
    private Integer id;
    private String nome;
    private String status;
    private Projeto projeto; // Associação: cada tarefa pertence a um projeto

    public Tarefa() {
    }

    public Tarefa(Integer id, String nome, String status, Projeto projeto) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.projeto = projeto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(id, tarefa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Tarefa [id=" + id + ", nome=" + nome + ", status=" + status +
                ", projeto=" + (projeto != null ? projeto.getId() : null) + "]";
    }
}
