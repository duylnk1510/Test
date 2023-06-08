package com.example.demo.s;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.e.NhanVien;

@Service
public interface NhanVienDAO extends JpaRepository<NhanVien, String>{

}
