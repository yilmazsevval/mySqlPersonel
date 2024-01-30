package com.tobeto.business.abstracts;

import java.util.List;

import com.tobeto.entity.Bolum;

public interface BolumService {
	void add(Bolum bolum);

	List<Bolum> getAll();
}
