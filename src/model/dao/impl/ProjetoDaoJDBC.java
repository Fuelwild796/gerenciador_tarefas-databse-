package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.ProjetoDao;
import model.entities.Projeto;

import java.sql.*;
import java.util.List;

public class ProjetoDaoJDBC implements ProjetoDao {

    private Connection conn;

    public ProjetoDaoJDBC(Connection conn) {
            this.conn = conn;
    }

    @Override
    public void inserir(Projeto projeto) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            st = conn.prepareStatement(
                     "INSERT INTO projeto "
                            + "(id,nome,descricao,data_inicio,data_fim) "
                             + "VALUES "
                            + "(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            st.setInt(1,projeto.getId());
            st.setString(2, projeto.getNome());
            st.setString(3,projeto.getDescricao());
            st.setDate(4,new Date(projeto.getDataInicio().getTime()));
            st.setDate(5,new Date(projeto.getDataFim().getTime()));

            int RowsAffected = st.executeUpdate();
            if (RowsAffected > 0) {
                rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    projeto.setId(id);
                }
                DB.closeResultSet(rs);
            } else {
                    throw new DbException("Erro ao inserir projeto");
            }

        }catch(SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }

    }

    @Override
    public void update(Projeto projeto) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Projeto findById(Integer id) {
        return null;
    }

    @Override
    public List<Projeto> findAll() {
        return List.of();
    }
}
