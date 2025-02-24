
//"https://github.com/Dev-EricaLopes/PSC-SBC-2024/blob/main/ProjetoGUI/src/Classes/Usuario.java"

package Classes;



import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author 823116201
 */
public class Funcionario {
    private int id;
    private String Usuario;
    private String Senha;
    private String TipoUsu;
    private String CPF;

    public Funcionario() {
    }

    public Funcionario(String Usuario, String Senha, String TipoUsu, String CPF) {
        this.Usuario = Usuario;
        this.Senha = Senha;
        this.TipoUsu = TipoUsu;
        this.CPF = CPF;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getTipoUsu() {
        return TipoUsu;
    }

    public void setTipoUsu(String TipoUsu) {
        this.TipoUsu = TipoUsu;
    }
    
    public boolean Login()
    {
        ConnectionFactory factory = new ConnectionFactory();
        
        
        String sql = "Select * from Funcionario where usuario = ? and senha = ?";
            try (Connection conn = factory.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, Usuario);
            ps.setString(2, Senha);
            ResultSet rs = ps.executeQuery();
        //5: itera sobre o resultado
        
        while (rs.next()){
            this.id = rs.getInt("id_funcionario");
            this.Usuario = rs.getString("usuario");
            this.Senha = rs.getString("senha");
            this.TipoUsu = rs.getString("tipoUsu");
            return true;
            }
        return false;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
        public boolean LoginComAdm()
    {
        ConnectionFactory factory = new ConnectionFactory();
        
        
        String sql = "Select * from Funcionario where usuario = ? and senha = ? and tipoUsu = 'Administrador'";
            try (Connection conn = factory.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, Usuario);
            ps.setString(2, Senha);
            ResultSet rs = ps.executeQuery();
        //5: itera sobre o resultado
        
        while (rs.next()){
            this.id = rs.getInt("id_funcionario");
            this.Usuario = rs.getString("usuario");
            this.Senha = rs.getString("senha");
            this.TipoUsu = rs.getString("tipoUsu");
            return true;
            }
        return false;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    public void inserir() {
        String sql = "INSERT INTO Funcionario (usuario, senha, cpf, tipoUsu) "
                + "VALUES (?, ?, ?, ?);";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, Senha);
            ps.setString(3, CPF);
            ps.setString(4, TipoUsu);


            ps.execute();

            JOptionPane.showMessageDialog(null, "Funcionario Incluído com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Inclusão!");
            e.printStackTrace();
        }
    }
    
    
    
    
}
