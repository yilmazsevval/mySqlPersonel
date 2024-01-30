package com.tobeto.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Personel extends EntityBase {
	private String adi;
	private String soyadi;
	private String email;
	@OneToMany(mappedBy = "personel")
	private List<Adres> adresler;
	@ManyToOne
	private Bolum bolum;
}
