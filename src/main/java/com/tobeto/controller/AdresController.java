package com.tobeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.business.abstracts.AdresService;
import com.tobeto.business.dtos.adres.requests.CreateAdresRequest;
import com.tobeto.core.utilities.mapper.ModelMapperService;
import com.tobeto.entity.Adres;

@RestController
@RequestMapping("/api/adres")
public class AdresController {
	@Autowired
	private ModelMapperService modelMapperService;

	@Autowired
	private AdresService adresService;

	@PostMapping
	public void add(@RequestBody CreateAdresRequest request) {
		Adres adres = modelMapperService.forRequest().map(request, Adres.class);
		adresService.add(adres);
	}
}
