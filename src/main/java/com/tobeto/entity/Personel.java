package com.tobeto.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
	@OneToMany(mappedBy = "personel", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private List<Adres> adresler;
	@ManyToOne(cascade = CascadeType.ALL)
	private Bolum bolum;
}
