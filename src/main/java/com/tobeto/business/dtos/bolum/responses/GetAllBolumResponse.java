package com.tobeto.business.dtos.bolum.responses;

import java.util.ArrayList;
import java.util.List;

import com.tobeto.business.dtos.personel.responses.GetAllPersonelResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBolumResponse {
	private String adi;
	private List<GetAllPersonelResponse> personeller = new ArrayList<GetAllPersonelResponse>();
}
