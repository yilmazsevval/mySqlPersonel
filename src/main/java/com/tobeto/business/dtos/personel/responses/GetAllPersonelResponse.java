package com.tobeto.business.dtos.personel.responses;

import java.util.List;

import com.tobeto.entity.Adres;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllPersonelResponse {
	private String adi;
	private String soyadi;
	private String email;
	private List<Adres> adresler;
}
