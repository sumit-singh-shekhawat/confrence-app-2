package com.cg.Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Demo.model.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

}
