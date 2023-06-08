package com.example.demo.c;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.e.NhanVien;
import com.example.demo.e.PhongBan;
import com.example.demo.s.NhanVienDAO;
import com.example.demo.s.PhongBanDAO;

@CrossOrigin("*")
@RestController
public class Ctrler {
	@Autowired
	PhongBanDAO dao;
	
	@Autowired
	NhanVienDAO nvDao;
	
	@GetMapping("/re")
	public List<PhongBan> getAll(Model model) {
		return dao.findAll();
	}
	
	@GetMapping("/renv")
	public List<NhanVien> getAl(Model model) {
		return nvDao.findAll();
	}
}
