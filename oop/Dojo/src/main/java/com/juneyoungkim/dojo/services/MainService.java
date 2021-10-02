package com.juneyoungkim.dojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juneyoungkim.dojo.models.Dojo;
import com.juneyoungkim.dojo.models.Ninja;
import com.juneyoungkim.dojo.repositories.DojoRepository;
import com.juneyoungkim.dojo.repositories.NinjaRepository;

@Service
public class MainService {
	@Autowired
	private DojoRepository dojoRepo;
	
	@Autowired
	private NinjaRepository ninjaRepo;
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Dojo saveDojo(Dojo d) {
		return dojoRepo.save(d);
	}
	
	public Dojo findDojo(Long dojo_id) {
		return dojoRepo.findById(dojo_id).orElse(null);
	}
	
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	public Ninja saveNinja(Ninja nin) {
		return ninjaRepo.save(nin);
	}
	
	public Ninja findNinja(Long dojo_id) {
		return ninjaRepo.findById(dojo_id).orElse(null);
	}
}
