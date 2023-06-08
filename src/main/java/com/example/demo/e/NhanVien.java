package com.example.demo.e;


import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;



@Entity
@Data
@Table(name = "Nhanvien")
public class NhanVien implements Serializable{
	@Id
    private String manv;

    private String tennv;
    private String phai;
    private String noisinh;
    private int luong;

    @ManyToOne
    @JoinColumn(name = "maphong")
    private PhongBan phongBan;

}

