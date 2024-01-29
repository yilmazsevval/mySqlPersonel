package com.tobeto.business.dtos.bolum.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBolumResponse {
	private String adi;
	private String personelAdi;
	private String personelSoyadi;
}
