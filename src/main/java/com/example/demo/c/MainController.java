package com.example.demo.c;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.e.NhanVien;
import com.example.demo.s.NhanVienDAO;
import com.example.demo.s.PhongBanDAO;


@Controller
public class MainController {
	
	@Autowired
	NhanVienDAO nvDao;
	
	@Autowired
	PhongBanDAO pbDao;

	@GetMapping("/viewUI")
	public String view(Model model) {
		List<NhanVien> list = nvDao.findAll();
		model.addAttribute("listNV", list);
		
		NhanVien nV = new NhanVien();
		
		model.addAttribute("nv", nV);
		model.addAttribute("listPb", pbDao.findAll());
		return "/main";
	}
	
	@GetMapping("/edit/{id}")
	public String eidt(Model model, @PathVariable("id") String id) {
		List<NhanVien> list = nvDao.findAll();
		model.addAttribute("listNV", list);
		
		NhanVien nV = nvDao.findById(id).get();
		System.out.println(nV.getPhai());
		model.addAttribute("nv", nV);
		model.addAttribute("listPb", pbDao.findAll());
		return "/main";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") String id) {
		nvDao.deleteById(id);
		return "redirect:/viewUI";
	}
	
	@PostMapping("/insert")
	public String create(NhanVien nv) {
		if(nv.getPhai().equals("true")) {
			nv.setPhai("nam");
		}else {
			nv.setPhai("nu");
		}
		System.out.println(nv);
		nvDao.save(nv);
		return "redirect:/viewUI";
	}
	
	
	@GetMapping("/clear")
	public String clear() {
		
		return "redirect:/viewUI";
	}
	
	
	
	
}
