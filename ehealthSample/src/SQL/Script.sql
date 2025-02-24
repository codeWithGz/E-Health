-- drop database bdhospital;
create database bdHospital;
use bdHospital;

CREATE TABLE Paciente (
    id_paciente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    data_nascimento VARCHAR(50) NOT NULL,
    genero VARCHAR(50),
    cpf VARCHAR(14) NOT NULL,
    endereco VARCHAR(200),
    numero_telefone VARCHAR(20),
    email VARCHAR(255),
    plano_saude VARCHAR(100),
    possui_alergias varchar(20),
    motivo_consulta varchar(200),
    observacoes varchar(200)
);

CREATE TABLE Consulta (
    paciente VARCHAR(255) PRIMARY KEY,
    data_hora_consulta VARCHAR(255) NOT NULL,
    medico_responsavel VARCHAR(255),
    tipo_consulta VARCHAR(100),
    status_consulta VARCHAR(50),
    observacoes VARCHAR(255),
    prontuario_medico VARCHAR(255),
    receita_medica VARCHAR(255)
);

CREATE TABLE Funcionario (
    id_funcionario INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(255),
    senha VARCHAR(100),
    cpf VARCHAR(14) NOT NULL,
    tipoUsu VARCHAR(30)
);

INSERT INTO Funcionario (usuario, senha, cpf, tipoUsu) VALUES ("Admin","adm", "000.000.000-00", "Administrador");

CREATE TABLE Exames (
    paciente VARCHAR(255) PRIMARY KEY,
	tipo_exame VARCHAR(100),
    status_exame VARCHAR(100),
    urgencia_exame VARCHAR(100),
    medico_responsavel VARCHAR(255),
    data_hora_consulta VARCHAR(255) NOT NULL,
    observacoes VARCHAR(255)
);

CREATE TABLE Agenda (
    id_consulta INT PRIMARY KEY auto_increment,
	nome_paciente VARCHAR(255),
    numero_paciente VARCHAR(20),
	especialidade_medica VARCHAR(50),
    medico_responsavel VARCHAR(255),
    data_consulta VARCHAR(10),
    hora_consulta VARCHAR(20),
    tipo_consulta VARCHAR(100),
    unidade_atendimento VARCHAR(255)
);
INSERT INTO Agenda() VALUES(1, "Inicia Index", "(00)0000-0000", "00000000", "0000", "00/00/0000", "00:00:00", "00000", "00000");

