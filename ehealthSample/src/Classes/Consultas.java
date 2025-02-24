package Classes;



import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import telas.optionControle;
import telas.registroConsultasAlterar;
import telas.registroConsultasConsultar;
import telas.registroConsultasExcluir;


public class Consultas {
    
    private String paciente;
    private String dateTime;
    private String medic;
    private String typeConsulta;
    private String statusConsulta;
    private String consultaObs;
    private String prontuario;
    private String receita;

    public Consultas() {
    }

    public Consultas(String paciente, String dateTime, String medic, String typeConsulta, String statusConsulta, String consultaObs, String prontuario, String receita) {
        this.paciente = paciente;
        this.dateTime = dateTime;
        this.medic = medic;
        this.typeConsulta = typeConsulta;
        this.statusConsulta = statusConsulta;
        this.consultaObs = consultaObs;
        this.prontuario = prontuario;
        this.receita = receita;
    }

    

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getMedic() {
        return medic;
    }

    public void setMedic(String medic) {
        this.medic = medic;
    }

    public String getTypeConsulta() {
        return typeConsulta;
    }

    public void setTypeConsulta(String typeConsulta) {
        this.typeConsulta = typeConsulta;
    }

    public String getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(String statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    public String getConsultaObs() {
        return consultaObs;
    }

    public void setConsultaObs(String consultaObs) {
        this.consultaObs = consultaObs;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }
    
    
    
        public void inserir() {
        String sql = "INSERT INTO Consulta () "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, paciente);
            ps.setString(2, dateTime);
            ps.setString(3, medic);
            ps.setString(4, typeConsulta);
            ps.setString(5, statusConsulta);
            ps.setString(6, consultaObs);
            ps.setString(7, prontuario);
            ps.setString(8, receita);


            ps.execute();

            JOptionPane.showMessageDialog(null, "Atendimento Incluído com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Inclusão!");
            e.printStackTrace();
        }
    }

    public void listar() {
        String sql = "SELECT * FROM Consulta";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // Aqui você pode manipular os dados retornados
            }

            JOptionPane.showMessageDialog(null, "Dados listados com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Listagem!");
            e.printStackTrace();
        }
    }

   public void buscarPorCPFConsultar(String CPF) {
        String sql = "SELECT * FROM Consulta WHERE paciente = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CPF);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                this.paciente = rs.getString("paciente");
                this.dateTime = rs.getString("data_hora_consulta");
                this.medic = rs.getString("medico_responsavel");
                this.typeConsulta = rs.getString("tipo_consulta");
                this.statusConsulta = rs.getString("status_consulta");
                this.consultaObs = rs.getString("observacoes");
                this.prontuario = rs.getString("prontuario_medico");
                this.receita = rs.getString("receita_medica");

                registroConsultasConsultar telaConsultar = new registroConsultasConsultar();
                telaConsultar.setText(this.paciente, this.dateTime, this.medic, 
                        this.typeConsulta, this.statusConsulta, this.consultaObs);
                
                telaConsultar.setVisible(true);

                JOptionPane.showMessageDialog(null, "Atendimento Localizado!");
            } else {
                JOptionPane.showMessageDialog(null, "Atendimento Não Localizado!");
                optionControle optCntrl = new optionControle();
                optCntrl.show();
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Busca!");
            e.printStackTrace();
        }
        
        
    }
   
   
   public void buscarPorCPFAlterar(String CPF) {
        String sql = "SELECT * FROM Consulta WHERE paciente = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CPF);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                this.paciente = rs.getString("paciente");
                this.dateTime = rs.getString("data_hora_consulta");
                this.medic = rs.getString("medico_responsavel");
                this.typeConsulta = rs.getString("tipo_consulta");
                this.statusConsulta = rs.getString("status_consulta");
                this.consultaObs = rs.getString("observacoes");
                this.prontuario = rs.getString("prontuario_medico");
                this.receita = rs.getString("receita_medica");

                registroConsultasAlterar telaConsultar = new registroConsultasAlterar();
                telaConsultar.setText(this.paciente, this.dateTime, this.medic, 
                        this.typeConsulta, this.statusConsulta, this.consultaObs);
                
                telaConsultar.setVisible(true);

                JOptionPane.showMessageDialog(null, "Atendimento Localizado!");
            } else {
                JOptionPane.showMessageDialog(null, "Atendimento Não Localizado!");
                optionControle optCntrl = new optionControle();
                optCntrl.show();
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Busca!");
            e.printStackTrace();
        }
        
        
    }
   
      public void buscarPorCPFExcluir(String pacienteName) {
        String sql = "SELECT * FROM Consulta WHERE paciente = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, pacienteName);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                this.paciente = rs.getString("paciente");
                this.dateTime = rs.getString("data_hora_consulta");
                this.medic = rs.getString("medico_responsavel");
                this.typeConsulta = rs.getString("tipo_consulta");
                this.statusConsulta = rs.getString("status_consulta");
                this.consultaObs = rs.getString("observacoes");
                this.prontuario = rs.getString("prontuario_medico");
                this.receita = rs.getString("receita_medica");

                registroConsultasExcluir telaConsultar = new registroConsultasExcluir();
                telaConsultar.setText(this.paciente, this.dateTime, this.medic, 
                        this.typeConsulta, this.statusConsulta, this.consultaObs);
                
                telaConsultar.setVisible(true);

                JOptionPane.showMessageDialog(null, "Atendimento Localizado!");
            } else {
                JOptionPane.showMessageDialog(null, "Atendimento Não Localizado!");
                optionControle optCntrl = new optionControle();
                optCntrl.show();
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Busca!");
            e.printStackTrace();
        }
        
        
    }   
   
   public void atualizar(String pacienteName) {
    String sql = "UPDATE Consulta SET paciente = ?, data_hora_consulta = ?, medico_responsavel = ?, tipo_consulta = ?, status_consulta = ?, observacoes = ?, prontuario_medico = ?, receita_medica = ? WHERE paciente = ?";

    ConnectionFactory factory = new ConnectionFactory();

    try (Connection c = factory.obtemConexao()) {
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, paciente);
        ps.setString(2, dateTime);
        ps.setString(3, medic);
        ps.setString(4, typeConsulta);
        ps.setString(5, statusConsulta);
        ps.setString(6, consultaObs);
        ps.setString(7, consultaObs);
        ps.setString(8, consultaObs);        
        ps.setString(9, pacienteName); 
        

        int rowsUpdated = ps.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Atendimento do paciente atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Atendimento não encontrado!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERRO na Atualização mtd atualizar!");
        e.printStackTrace();
    }
}
   
   public void excluir(String pacienteName) {
    String sql = "DELETE FROM Consulta WHERE paciente = ?";
    ConnectionFactory factory = new ConnectionFactory();

    try (Connection c = factory.obtemConexao()) {
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, pacienteName);

        int rowsDeleted = ps.executeUpdate();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Atendimento excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Atendimento não encontrado!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERRO na Exclusão!");
        e.printStackTrace();
    }
   }
    
}
