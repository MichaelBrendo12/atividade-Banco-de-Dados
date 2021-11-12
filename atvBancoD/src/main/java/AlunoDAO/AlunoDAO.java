
package AlunoDAO;
import com.mycompany.atvbancod.cadastro.model.Aluno;
import conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class AlunoDAO {
    public void inserirAluno(Aluno a)
    {
        try{
        String SQL = "INSERT INTO michael_brendo.aluno(nome_aluno, email, disciplina, ano) VALUES(?,?,?,?)";
        Connection minhaConexao = conexao.getConexao();
        PreparedStatement comando = minhaConexao.prepareStatement(SQL);
        comando.setString(1, a.getNome_aluno());
        comando.setString(2, a.getEmail());
        comando.setString(3, a.getDisciplina());
        comando.setString(4, a.getAno());
        int retorno = comando.executeUpdate();
        if(retorno>0)
        {
            JOptionPane.showMessageDialog(null, "Aluno: "+a.getNome_aluno()+" Cadastrado com Sucesso!!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Aluno: "+a.getNome_aluno()+" Verifique os Logs");
        }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
