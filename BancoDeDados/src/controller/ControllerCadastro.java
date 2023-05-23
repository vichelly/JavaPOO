package controller;
import DAO.AlunoDAO;
import DAO.Conexao;
import model.Aluno;
import view.CadastroFrame;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ControllerCadastro {
    private CadastroFrame view;

    public ControllerCadastro(CadastroFrame view) {
        this.view = view;
    }
    
    public void salvarAluno(){
        String nome = view.getNome_cadastro().getText();
        String usuario = view.getUsuario_cadastro().getText();
        String senha = view.getSenha_cadastro().getText();
        Aluno aluno = new Aluno(nome, usuario, senha);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            AlunoDAO dao = new AlunoDAO(conn);
            dao.inserir(aluno);
            JOptionPane.showMessageDialog(view, "Usuário Cadastrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Falha de conexão!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
