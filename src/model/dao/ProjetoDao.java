package model.dao;

import model.entities.Projeto;

import java.util.List;

public interface ProjetoDao {

    void inserir(Projeto projeto);
    void update(Projeto projeto);
    void deleteById(Integer id);
    Projeto findById(Integer id);
    List<Projeto> findAll();
}
