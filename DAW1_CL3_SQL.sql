DROP DATABASE IF EXISTS DB_Escobar;
CREATE DATABASE DB_Escobar;
USE DB_Escobar;

create table carrera(
idcarrera int not null primary key,  
descripcion varchar(45)
);

create table reserva(
codigo int not null auto_increment,
nombre varchar(25),
apellido varchar(25),
idcarrera int,
fchregistro int,
primary key (codigo)			
);

alter table reserva add constraint FK01_carrera foreign key(idcarrera) references carrera(idcarrera) ON DELETE CASCADE ON UPDATE CASCADE;


insert into carrera values (1, 'Tecnologia');
insert into carrera values (2, 'Diseño');
insert into carrera values (3, 'Comunicaciones');
select * from carrera;


insert into reserva values (1, 'Adrian','Escobar',1,2022);
insert into reserva values (2, 'Sebastian', 'Mazzi',3,2022);

select * from reserva;