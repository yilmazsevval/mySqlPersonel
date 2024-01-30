package com.tobeto.business.dtos.personel.responses;

import java.util.ArrayList;
import java.util.List;

import com.tobeto.business.dtos.adres.responses.GetAllAdresResponse;

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
	private String bolumAdi;
	private List<GetAllAdresResponse> adresler = new ArrayList<GetAllAdresResponse>();
}
