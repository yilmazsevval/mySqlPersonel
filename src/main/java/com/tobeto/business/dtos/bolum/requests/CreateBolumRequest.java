package com.tobeto.business.dtos.bolum.requests;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBolumRequest {
	private String adi;
	private UUID personelId;
}
