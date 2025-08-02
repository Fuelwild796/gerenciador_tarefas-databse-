package application;

import model.dao.DaoFactory;
import model.dao.ProjetoDao;
import model.entities.Projeto;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        System.out.println("==== AREA DE TESTES ====");

        ProjetoDao projetodao = DaoFactory.createProjetoDao();

        Projeto projeto = new Projeto(1,"Meu amor", "Dar bom dia para minha namorada",new Date(),new Date());
        Projeto projeto1 = new Projeto(2,"Banho","Tomar banho",new Date(),new Date());

        //projetodao.inserir(projeto);
       // System.out.println("DADOS CADASTRADOS!");

        projeto.setNome("Evellyn");

        projetodao.update(projeto);


        //projetodao.deleteById(1);
        //System.out.println("DADOS DELETADOS!");

    }
}
