package application;

import model.dao.DaoFactory;
import model.dao.ProjetoDao;
import model.entities.Projeto;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        ProjetoDao projetodao = DaoFactory.createProjetoDao();

        Projeto projeto = new Projeto(1,"Meu amor", "Dar bom dia para minha namorada",new Date(),new Date());

        projetodao.inserir(projeto);
        System.out.println("DADOS CADASTRADOS!");

    }
}
