package model.dao;

import model.entities.Tarefa;

import java.util.List;

public interface TarefaDao {

    void inserir(Tarefa tarefa);
    void update(Tarefa tarefa);
    void deleteById(Integer id);
    Tarefa findById(Integer id);
    List<Tarefa> findAll();


}
