package com.tobeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.business.abstracts.PersonelService;
import com.tobeto.business.dtos.personel.requests.CreatePersonelRequest;
import com.tobeto.business.dtos.personel.responses.GetAllPersonelResponse;
import com.tobeto.core.utilities.mapper.ModelMapperService;
import com.tobeto.entity.Personel;

@RestController
@RequestMapping("/api/personel")
public class PersonelsController {

	@Autowired
	private PersonelService personelService;
	@Autowired
	private ModelMapperService modelMapperService;

	@PostMapping
	public void add(@RequestBody CreatePersonelRequest createPersonelRequest) {
		Personel personel = modelMapperService.forRequest().map(createPersonelRequest, Personel.class);
		personelService.add(personel);
		System.out.println(personel.getId());
	}

	@GetMapping
	public List<GetAllPersonelResponse> getAll(GetAllPersonelResponse response) {
		return personelService.getAll(response);
	}
}

//@JsonBackReference 
//@JsonManagedReference