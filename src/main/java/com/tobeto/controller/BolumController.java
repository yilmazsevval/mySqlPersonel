package com.tobeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.business.abstracts.BolumService;
import com.tobeto.business.dtos.bolum.requests.CreateBolumRequest;
import com.tobeto.core.utilities.mapper.ModelMapperService;
import com.tobeto.entity.Bolum;

@RestController
@RequestMapping("/api/bolum")
public class BolumController {

	@Autowired
	private BolumService bolumService;

	@Autowired
	private ModelMapperService modelMapperService;

	@PostMapping
	public void add(@RequestBody CreateBolumRequest request) {
		Bolum bolum = modelMapperService.forRequest().map(request, Bolum.class);
		bolumService.add(bolum);
	}
}
