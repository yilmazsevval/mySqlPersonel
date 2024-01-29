package com.tobeto.business.dtos.adres.requests;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAdresRequest {
	private String il;
	private String ilce;
	private String adres;
	private UUID personelId;
}
