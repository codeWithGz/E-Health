package Classes;

import telas.controlePacientes;
import telas.controlePacientesAlterar;
import telas.controlePacientesConsultar;
import telas.controlePacientesExcluir;
import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import telas.optionControle;

public class Pacientes {
    private String name;
    private String birthDate;
    private String gender;
    private String CPF;
    private String address;
    private String phoneNumber;
    private String email;
    private String healthPlan;
    private String ckAllergy;
    private String motive;
    private String observation;

    public Pacientes() {
    }

    public Pacientes(String name, String birthDate, String gender, String CPF, String address, String phoneNumber, String email, String healthPlan, String ckAllergy, String motive, String obs) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.CPF = CPF;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.healthPlan = healthPlan;
        this.ckAllergy = ckAllergy;
        this.motive = motive;
        this.observation = obs;
    }

    // Getters e Setters ...

    public void inserir() {
        String sql = "INSERT INTO Paciente (nome, data_nascimento, genero, cpf, endereco, numero_telefone, email, plano_saude, possui_alergias, motivo_consulta, observacoes) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, birthDate);
            ps.setString(3, gender);
            ps.setString(4, CPF);
            ps.setString(5, address);
            ps.setString(6, phoneNumber);
            ps.setString(7, email);
            ps.setString(8, healthPlan);
            ps.setString(9, ckAllergy);
            ps.setString(10, motive);
            ps.setString(11, observation);

            ps.execute();

            JOptionPane.showMessageDialog(null, "Usuário Incluído com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Inclusão!");
            e.printStackTrace();
        }
    }

    public void listar() {
        String sql = "SELECT * FROM pacientes";
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
        String sql = "SELECT * FROM Paciente WHERE cpf = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CPF);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                this.name = rs.getString("nome");
                this.birthDate = rs.getString("data_nascimento");
                this.gender = rs.getString("genero");
                this.address = rs.getString("endereco");
                this.phoneNumber = rs.getString("numero_telefone");
                this.email = rs.getString("email");
                this.healthPlan = rs.getString("plano_saude");
                this.ckAllergy = rs.getString("possui_alergias");
                this.motive = rs.getString("motivo_consulta");
                this.observation = rs.getString("observacoes");
                this.CPF = rs.getString("cpf");

                controlePacientesConsultar telaConsultar = new controlePacientesConsultar();
                telaConsultar.setText(this.name, this.birthDate, this.CPF, this.gender, 
                        this.phoneNumber, this.healthPlan, this.address, this.email, 
                        this.ckAllergy, this.motive, this.observation);
                
               
                
              
                telaConsultar.setVisible(true);

                JOptionPane.showMessageDialog(null, "Paciente Localizado!");
            } else {
                JOptionPane.showMessageDialog(null, "Paciente Não Localizado!");
                optionControle optCntrl = new optionControle();
                optCntrl.show();
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Busca!");
            e.printStackTrace();
        }
        
        
    }
   
   
   public void buscarPorCPFAlterar(String CPF) {
        String sql = "SELECT * FROM Paciente WHERE cpf = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CPF);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                this.name = rs.getString("nome");
                this.birthDate = rs.getString("data_nascimento");
                this.gender = rs.getString("genero");
                this.address = rs.getString("endereco");
                this.phoneNumber = rs.getString("numero_telefone");
                this.email = rs.getString("email");
                this.healthPlan = rs.getString("plano_saude");
                this.ckAllergy = rs.getString("possui_alergias");
                this.motive = rs.getString("motivo_consulta");
                this.observation = rs.getString("observacoes");
                this.CPF = rs.getString("cpf");

                controlePacientesAlterar telaAlterar = new controlePacientesAlterar();
                telaAlterar.setText(this.name, this.birthDate, this.CPF, this.gender, 
                        this.phoneNumber, this.healthPlan, this.address, this.email, 
                        this.ckAllergy, this.motive, this.observation);
                
               
                
              
                telaAlterar.setVisible(true);

                JOptionPane.showMessageDialog(null, "Paciente encontrado com Sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Paciente não encontrado!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Busca!");
            e.printStackTrace();
        }
        
        
    }
   
      public void buscarPorCPFExcluir(String CPF) {
        String sql = "SELECT * FROM Paciente WHERE cpf = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CPF);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                this.name = rs.getString("nome");
                this.birthDate = rs.getString("data_nascimento");
                this.gender = rs.getString("genero");
                this.address = rs.getString("endereco");
                this.phoneNumber = rs.getString("numero_telefone");
                this.email = rs.getString("email");
                this.healthPlan = rs.getString("plano_saude");
                this.ckAllergy = rs.getString("possui_alergias");
                this.motive = rs.getString("motivo_consulta");
                this.observation = rs.getString("observacoes");
                this.CPF = rs.getString("cpf");

                controlePacientesExcluir telaExcluir = new controlePacientesExcluir();
                telaExcluir.setText(this.name, this.birthDate, this.CPF, this.gender, 
                        this.phoneNumber, this.healthPlan, this.address, this.email, 
                        this.ckAllergy, this.motive, this.observation);
                
               
                
              
                telaExcluir.setVisible(true);

                JOptionPane.showMessageDialog(null, "Paciente encontrado com Sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Paciente não encontrado!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO na Busca!");
            e.printStackTrace();
        }
        
        
    }


   
   
   public void atualizar(String CPF) {
    String sql = "UPDATE Paciente SET nome = ?, data_nascimento = ?, genero = ?, endereco = ?, numero_telefone = ?, email = ?, plano_saude = ?, possui_alergias = ?, motivo_consulta = ?, observacoes = ? WHERE cpf = ?";
    ConnectionFactory factory = new ConnectionFactory();

    try (Connection c = factory.obtemConexao()) {
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, birthDate);
        ps.setString(3, gender);
        ps.setString(4, address);
        ps.setString(5, phoneNumber);
        ps.setString(6, email);
        ps.setString(7, healthPlan);
        ps.setString(8, ckAllergy);
        ps.setString(9, motive);
        ps.setString(10, observation);
        ps.setString(11, CPF);

        int rowsUpdated = ps.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Dados do paciente atualizados com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERRO na Atualização!");
        e.printStackTrace();
    }
}
   
   public void excluir(String CPF) {
    String sql = "DELETE FROM Paciente WHERE cpf = ?";
    ConnectionFactory factory = new ConnectionFactory();

    try (Connection c = factory.obtemConexao()) {
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, CPF);

        int rowsDeleted = ps.executeUpdate();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERRO na Exclusão!");
        e.printStackTrace();
    }
}
}