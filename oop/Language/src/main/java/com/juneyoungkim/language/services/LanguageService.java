package com.juneyoungkim.language.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juneyoungkim.language.models.Language;
import com.juneyoungkim.language.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository langRepo;
	
	public Language saveLanguage(Language language) {
		return langRepo.save(language);
	}
	
	public List<Language> allLanguages() {
		return langRepo.findAll();
	}
	
	public Language findOneLanguage(Long id) {
		return langRepo.findById(id).orElse(null);
	}
	
	public void deleteLanguage(Long id) {
		langRepo.deleteById(id);
	}
}
