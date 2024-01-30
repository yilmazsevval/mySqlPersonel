package com.tobeto.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.business.abstracts.AdresService;
import com.tobeto.entity.Adres;
import com.tobeto.repository.AdresRepository;

@Service
public class AdresManager implements AdresService {

	@Autowired
	private AdresRepository adresRepository;

	@Override
	public void add(Adres adres) {
		this.adresRepository.save(adres);

	}

	@Override
	public List<Adres> getAll() {
		return adresRepository.findAll();
	}

}
