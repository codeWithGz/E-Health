package Classes;


import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import telas.agendamentoConsultasConsultar;
import telas.optionAgendamento;



public class Agendamento {
    private String nomePaciente;
    private String numeroPaciente;
    private String especialidadeMedica;
    private String medicoResponsavel;
    private String dataConsulta;
    private String horaConsulta;
    private String tipoConsulta;
    private String unidadeAtendimento;

    public Agendamento() {
    }

    public Agendamento(String nomePaciente, String numeroPaciente, String especialidadeMedica, String medicoResponsavel, String dataConsulta, String horaConsulta, String tipoConsulta, String unidadeAtendimento) {
        this.nomePaciente = nomePaciente;
        this.numeroPaciente = numeroPaciente;
        this.especialidadeMedica = especialidadeMedica;
        this.medicoResponsavel = medicoResponsavel;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.tipoConsulta = tipoConsulta;
        this.unidadeAtendimento = unidadeAtendimento;
    }

    public String getUnidadeAtendimento() {
        return unidadeAtendimento;
    }

    public void setUnidadeAtendimento(String unidadeAtendimento) {
        this.unidadeAtendimento = unidadeAtendimento;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNumeroPaciente() {
        return numeroPaciente;
    }

    public void setNumeroPaciente(String numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public String getEspecialidadeMedica() {
        return especialidadeMedica;
    }

    public void setEspecialidadeMedica(String especialidadeMedica) {
        this.especialidadeMedica = especialidadeMedica;
    }

    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
    
public void inserir() {
    String checkSql = "SELECT COUNT(*) FROM Agenda WHERE medico_responsavel = ? AND data_consulta = ? AND hora_consulta = ?";
    String insertSql = "INSERT INTO Agenda (nome_paciente, numero_paciente, especialidade_medica, medico_responsavel, data_consulta, hora_consulta, tipo_consulta, unidade_atendimento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    ConnectionFactory factory = new ConnectionFactory();

    try (Connection c = factory.obtemConexao()) {
        // Verificar se já existe um agendamento com a mesma especialidade médica e horário
        PreparedStatement checkPs = c.prepareStatement(checkSql);
        checkPs.setString(1, medicoResponsavel);
        checkPs.setString(2, dataConsulta);
        checkPs.setString(3, horaConsulta);

        ResultSet rs = checkPs.executeQuery();
        rs.next();
        int count = rs.getInt(1);

        if (count > 0) {
            JOptionPane.showMessageDialog(null, "Já Existe um Agendamento para o medico " + medicoResponsavel + " Nesse Horario. Por favor, altere o horário do agendamento.");
            return;
        }

        // Inserir novo agendamento
        PreparedStatement insertPs = c.prepareStatement(insertSql);
        insertPs.setString(1, nomePaciente);
        insertPs.setString(2, numeroPaciente);
        insertPs.setString(3, especialidadeMedica);
        insertPs.setString(4, medicoResponsavel);
        insertPs.setString(5, dataConsulta);
        insertPs.setString(6, horaConsulta);
        insertPs.setString(7, tipoConsulta);
        insertPs.setString(8, unidadeAtendimento);

        insertPs.execute();

        JOptionPane.showMessageDialog(null, "Agendamento Incluído com Sucesso!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERRO na Inclusão!");
        e.printStackTrace();
    }
}


public void buscarPorDataConsultar(String dataConsulta) {
String sql = "SELECT * FROM Agenda WHERE data_consulta = ? ORDER BY especialidade_medica ASC, hora_consulta ASC";
    ConnectionFactory factory = new ConnectionFactory();

    try (Connection c = factory.obtemConexao()) {
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, dataConsulta);

        ResultSet rs = ps.executeQuery();

        boolean found = false;
        List<Agendamento> agendamentos = new ArrayList<>();

        while (rs.next()) {
            found = true;
            Agendamento agendamento = new Agendamento();
            agendamento.setNomePaciente(rs.getString("nome_paciente"));
            agendamento.setNumeroPaciente(rs.getString("numero_paciente"));
            agendamento.setEspecialidadeMedica(rs.getString("especialidade_medica"));
            agendamento.setMedicoResponsavel(rs.getString("medico_responsavel"));
            agendamento.setDataConsulta(rs.getString("data_consulta"));
            agendamento.setHoraConsulta(rs.getString("hora_consulta"));
            agendamento.setTipoConsulta(rs.getString("tipo_consulta"));
            agendamento.setUnidadeAtendimento(rs.getString("unidade_atendimento"));

            agendamentos.add(agendamento);
        }

if (found) {
    // Exibir em uma JTable
    String[] colunas = {"Nome Paciente", "Número Paciente", "Especialidade Médica", "Médico Responsável", "Data Consulta", "Hora Consulta", "Tipo Consulta", "Unidade Atendimento"};
    DefaultTableModel model = new DefaultTableModel(colunas, 0);
    for (Agendamento agendamento : agendamentos) {
        Object[] linha = {agendamento.getNomePaciente(), agendamento.getNumeroPaciente(),
                agendamento.getEspecialidadeMedica(), agendamento.getMedicoResponsavel(),
                agendamento.getDataConsulta(), agendamento.getHoraConsulta(),
                agendamento.getTipoConsulta(), agendamento.getUnidadeAtendimento()};
        model.addRow(linha);
    }
    JTable aquelaQueTemQueSumir = new JTable(model);

    // Adicionar ListSelectionListener para detectar seleção de linha
    aquelaQueTemQueSumir.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                // Aqui você pode fazer o que quiser quando uma linha for selecionada
                int selectedRow = aquelaQueTemQueSumir.getSelectedRow();
                if (selectedRow != -1) {
                    Agendamento selectedAgendamento = agendamentos.get(selectedRow);
                    agendamentoConsultasConsultar telaConsultar = new agendamentoConsultasConsultar();
                    telaConsultar.setText(selectedAgendamento.getNomePaciente(), selectedAgendamento.getNumeroPaciente(),
                                          selectedAgendamento.getEspecialidadeMedica(), selectedAgendamento.getMedicoResponsavel(),
                                          selectedAgendamento.getDataConsulta(), selectedAgendamento.getHoraConsulta(),
                                          selectedAgendamento.getTipoConsulta(), selectedAgendamento.getUnidadeAtendimento());
                    telaConsultar.show();
                   
                }
            }
        }
    });
            JOptionPane.showMessageDialog(null, new JScrollPane(aquelaQueTemQueSumir));  
} else {
    JOptionPane.showMessageDialog(null, "Atendimento Não Localizado!");
    optionAgendamento optCntrl = new optionAgendamento();
    optCntrl.show();
}
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERRO na Busca!");
        e.printStackTrace();
    }
}
}
