package com.tobeto.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.business.abstracts.PersonelService;
import com.tobeto.business.dtos.personel.responses.GetAllPersonelResponse;
import com.tobeto.core.utilities.mapper.ModelMapperService;
import com.tobeto.entity.Personel;
import com.tobeto.repository.PersonelRepository;

@Service
public class PersonelManager implements PersonelService {
	@Autowired
	private PersonelRepository personelRepository;

	@Autowired
	private ModelMapperService modelMapperService;

	@Override
	public void add(Personel personel) {
		this.personelRepository.save(personel);
	}

	public List<GetAllPersonelResponse> getAll(GetAllPersonelResponse response) {
		List<Personel> personeller = personelRepository.findAll();
		List<GetAllPersonelResponse> personelResponse = personeller.stream()
				.map(personel -> modelMapperService.forResponse().map(personel, GetAllPersonelResponse.class)).toList();
		return personelResponse;
	}
}
