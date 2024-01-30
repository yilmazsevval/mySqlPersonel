package com.tobeto.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.business.abstracts.BolumService;
import com.tobeto.entity.Bolum;
import com.tobeto.repository.BolumRepository;

@Service
public class BolumManager implements BolumService {

	@Autowired
	private BolumRepository bolumRepository;

	@Override
	public void add(Bolum bolum) {
		this.bolumRepository.save(bolum);

	}

	@Override
	public List<Bolum> getAll() {
		return bolumRepository.findAll();
	}

}
