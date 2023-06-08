create database test1;
use test1;

drop table Phongban;
create table Phongban (
	Maphong varchar(2) PRIMARY KEY not null,
    Tenphong varchar(30) not null
);

drop table Nhanvien;
create table Nhanvien (
	Manv varchar(3) PRIMARY KEY not null,
    Tennv varchar(100) not null,
    Phai  varchar(3),
    Noisinh varchar(200),
    Maphong varchar(2),
    Luong int,
    FOREIGN KEY (Maphong) REFERENCES Phongban(Maphong)
);

INSERT INTO Phongban (Maphong, Tenphong)
VALUES ('m2', 'phong 2');

INSERT INTO Nhanvien (Manv, Tennv, Phai, Noisinh, Maphong, Luong )
VALUES ('n2', 'nv 2', 'nu', 'BD', 'm2', 1000);


select * from Phongban