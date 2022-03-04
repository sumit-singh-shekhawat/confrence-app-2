package com.cg.Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Demo.model.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
