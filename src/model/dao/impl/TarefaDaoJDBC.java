package model.dao.impl;

import model.dao.TarefaDao;
import model.entities.Tarefa;

import java.sql.Connection;
import java.util.List;

public class TarefaDaoJDBC implements TarefaDao {

    private Connection conn;

    public TarefaDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(Tarefa tarefa) {

    }

    @Override
    public void update(Tarefa tarefa) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Tarefa findById(Integer id) {
        return null;
    }

    @Override
    public List<Tarefa> findAll() {
        return List.of();
    }
}
