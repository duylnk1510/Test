package com.example.demo.e;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "Phongban")
public class PhongBan implements Serializable{
	@Id
    private String maphong;

    private String tenphong;
    
    @OneToMany(mappedBy = "phongBan")
    @JsonIgnore
    List<NhanVien> listNV;
    
}
