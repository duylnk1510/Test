package com.example.demo.s;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.e.PhongBan;

@Service
public interface PhongBanDAO extends JpaRepository<PhongBan, String>{

}
