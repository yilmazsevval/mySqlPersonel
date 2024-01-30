package com.tobeto.business.abstracts;

import java.util.List;

import com.tobeto.entity.Adres;

public interface AdresService {
	void add(Adres adres);

	List<Adres> getAll();
}
