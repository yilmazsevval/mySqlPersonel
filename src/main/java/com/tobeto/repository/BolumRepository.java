package com.tobeto.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entity.Bolum;

public interface BolumRepository extends JpaRepository<Bolum, UUID> {

}
