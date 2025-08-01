package model.dao;

import db.DB;
import model.dao.impl.ProjetoDaoJDBC;
import model.dao.impl.TarefaDaoJDBC;

public class DaoFactory {

    public static ProjetoDao createProjetoDao() {

        return new ProjetoDaoJDBC(DB.getConnection());
    }

    public static TarefaDao createTarefaDao() {
        return new TarefaDaoJDBC(DB.getConnection());
    }
}
