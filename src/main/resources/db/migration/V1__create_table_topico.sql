
create table topico(
id int not null auto_increment primary key,
titulo varchar(255),
mensagem varchar(255),
data_criacao  Date,
estado_topico varchar(255),
autor varchar(255),
curso varchar(255)
);