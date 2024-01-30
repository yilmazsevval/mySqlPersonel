package com.tobeto.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.business.abstracts.PersonelService;
import com.tobeto.entity.Personel;
import com.tobeto.repository.PersonelRepository;

@Service
public class PersonelManager implements PersonelService {
	@Autowired
	private PersonelRepository personelRepository;

	@Override
	public void add(Personel personel) {
		this.personelRepository.save(personel);
	}

	@Override
	public List<Personel> getAll() {
		return personelRepository.findAll();
	}
}
