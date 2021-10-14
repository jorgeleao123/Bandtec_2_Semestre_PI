create database sprintTotemHub;

use sprintTotemHub;

create table empresa(
	cnpj_empresa int,
    nome_empresa varchar(45),
    primary key(cnpj_empresa)
);

create table estacao(
	id_estacao int,
    fk_empresa int,
    nome_estacao varchar(45),
    qnt_totem int,
    primary key (id_estacao),
    foreign key (fk_empresa) references empresa(cnpj_empresa)
);

create table agente_de_estacao(
	id_agente int,
    fk_estacao int,
    fk_empresa int,
    nome_agente varchar(45),
    login_agente varchar(50),
    senha_agente varchar(20),
    primary key(id_agente),
    foreign key(fk_estacao) references estacao(id_estacao),
    foreign key(fk_empresa) references empresa(cnpj_empresa)
);

create table totem(
	id_totem int,
    fk_estacao int,
    primary key(id_totem),
    foreign key(fk_estacao) references estacao(id_estacao)
);

create table historico_totem(
	id_historico int,
    fk_agente int,
    fk_totem int,
    cpu_totem int,
    memoria_ram_totem int,
    horario_totem datetime,
    funcionamento_totem char(1),
    primary key(id_historico),
    foreign key(fk_agente) references agente_de_estacao(id_agente),
    foreign key(fk_totem) references totem(id_totem)
);

show tables;