package com.tobeto.business.dtos.personel.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePersonelRequest {
	private String adi;
	private String soyadi;
	private String email;
}
