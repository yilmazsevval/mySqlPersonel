package com.tobeto.business.abstracts;

import java.util.List;

import com.tobeto.entity.Personel;

public interface PersonelService {
	void add(Personel personel);

	List<Personel> getAll();
}
