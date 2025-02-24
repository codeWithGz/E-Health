
package Classes;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


import javax.swing.JOptionPane;
import telas.gestaoExamesAlterar;
import telas.gestaoExamesConsultar;
import telas.gestaoExamesExcluir;
import telas.optionExames;

public class Exames {
    private String paciente;
    private String examType;
    private String examStatus;
    private String examUrge;
    private String medic;
    private String dateTime;
    private String examObs;

    public Exames() {
    }

    public Exames(String paciente, String examType, String examStatus, String examUrge, String medic, String dateTime, String examObs) {
        this.paciente = paciente;
        this.examType = examType;
        this.examStatus = examStatus;
        this.examUrge = examUrge;
        this.medic = medic;
        this.dateTime = dateTime;
        this.examObs = examObs;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getExamStatus() {
        return examStatus;
    }

    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus;
    }

    public String getExamUrge() {
        return examUrge;
    }

    public void setExamUrge(String examUrge) {
        this.examUrge = examUrge;
    }

    public String getMedic() {
        return medic;
    }

    public void setMedic(String medic) {
        this.medic = medic;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getExamObs() {
        return examObs;
    }

    public void setExamObs(String examObs) {
        this.examObs = examObs;
    }
    
        public void inserir() {
        String sql = "INSERT INTO Exames (paciente, tipo_exame, status_exame, urgencia_exame, "
                + "medico_responsavel, data_hora_consulta, observacoes) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?);";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, paciente);
            ps.setString(2, examType);
            ps.setString(3, examStatus);
            ps.setString(4, examUrge);
            ps.setString(5, medic);
            ps.setString(6, dateTime);
            ps.setString(7, examObs);


            ps.execute();

            JOptionPane.showMessageDialog(null, "Exame Incluído com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Inclusão!");
            e.printStackTrace();
        }
    }
        
            public void listar() {
        String sql = "SELECT * FROM Exames";
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
        String sql = "SELECT * FROM Exames WHERE paciente = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CPF);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                this.paciente = rs.getString("paciente");
                this.examType = rs.getString("tipo_exame");
                this.examStatus = rs.getString("status_exame");
                this.examUrge = rs.getString("urgencia_exame");
                this.medic = rs.getString("medico_responsavel");
                this.dateTime = rs.getString("data_hora_consulta");
                this.examObs = rs.getString("observacoes");

                gestaoExamesConsultar telaConsultar = new gestaoExamesConsultar();
                telaConsultar.setText(this.paciente, this.examType, this.examStatus, this.examUrge, this.medic, 
                        this.dateTime, this.examObs);
                
                telaConsultar.setVisible(true);

                JOptionPane.showMessageDialog(null, "Atendimento Localizado!");
            } else {
                JOptionPane.showMessageDialog(null, "Atendimento Não Localizado!");
                optionExames optExam = new optionExames();
                optExam.show();
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Busca!");
            e.printStackTrace();
        }  
    }
   
     
   public void buscarPorCPFAlterar(String CPF) {
        String sql = "SELECT * FROM Exames WHERE paciente = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CPF);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                this.paciente = rs.getString("paciente");
                this.examType = rs.getString("tipo_exame");
                this.examStatus = rs.getString("status_exame");
                this.examUrge = rs.getString("urgencia_exame");
                this.medic = rs.getString("medico_responsavel");
                this.dateTime = rs.getString("data_hora_consulta");
                this.examObs = rs.getString("observacoes");

                gestaoExamesAlterar telaConsultar = new gestaoExamesAlterar();
                telaConsultar.setText(this.paciente, this.examType, this.examStatus, this.examUrge, this.medic, 
                        this.dateTime, this.examObs);
                
                telaConsultar.setVisible(true);

                JOptionPane.showMessageDialog(null, "Atendimento Localizado!");
            } else {
                JOptionPane.showMessageDialog(null, "Atendimento Não Localizado!");
                optionExames optExam = new optionExames();
                optExam.show();
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Busca!");
            e.printStackTrace();
        }  
    }   
   
      
   public void atualizar(String pacienteName) {
    String sql = "UPDATE Exames SET paciente = ?, tipo_exame = ?, "
            + "status_exame = ?, urgencia_exame = ?, medico_responsavel = ?, "
            + "data_hora_consulta = ?, observacoes = ? "
            + "WHERE paciente = ?";

    ConnectionFactory factory = new ConnectionFactory();

    try (Connection c = factory.obtemConexao()) {
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, paciente);
        ps.setString(2, examType);
        ps.setString(3, examStatus);
        ps.setString(4, examUrge);
        ps.setString(5, medic);
        ps.setString(6, dateTime);
        ps.setString(7, examObs);        
        ps.setString(8, pacienteName); 
        

        int rowsUpdated = ps.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Exame do paciente atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Exame não encontrado!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERRO na Atualização mtd atualizar!");
        e.printStackTrace();
    }
}
   
   
      public void buscarPorCPFExcluir(String pacienteName) {
        String sql = "SELECT * FROM Exames WHERE paciente = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, pacienteName);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                this.paciente = rs.getString("paciente");
                this.examType = rs.getString("tipo_exame");
                this.examStatus = rs.getString("status_exame");
                this.examUrge = rs.getString("urgencia_exame");
                this.medic = rs.getString("medico_responsavel");
                this.dateTime = rs.getString("data_hora_consulta");
                this.examObs = rs.getString("observacoes");

                gestaoExamesExcluir telaConsultar = new gestaoExamesExcluir();
                telaConsultar.setText(this.paciente, this.examType, this.examStatus, this.examUrge, this.medic, 
                        this.dateTime, this.examObs);
                
                telaConsultar.setVisible(true);

                JOptionPane.showMessageDialog(null, "Atendimento Localizado!");
            } else {
                JOptionPane.showMessageDialog(null, "Atendimento Não Localizado!");
                optionExames optExam = new optionExames();
                optExam.show();
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Busca!");
            e.printStackTrace();
        }  
    }      
      
   public void excluir(String pacienteName) {
    String sql = "DELETE FROM Exames WHERE paciente = ?";
    ConnectionFactory factory = new ConnectionFactory();

    try (Connection c = factory.obtemConexao()) {
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, pacienteName);

        int rowsDeleted = ps.executeUpdate();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Exame excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Exame não encontrado!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERRO na Exclusão!");
        e.printStackTrace();
    }
   }
}
