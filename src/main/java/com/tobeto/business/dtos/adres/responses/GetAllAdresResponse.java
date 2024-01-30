package com.tobeto.business.dtos.adres.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAdresResponse {
	private String il;
	private String ilce;
	private String adres;
//	private String personelAdi;
//	private String personelSoyadi;
}
