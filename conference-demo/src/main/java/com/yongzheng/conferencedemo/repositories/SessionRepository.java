package com.yongzheng.conferencedemo.repositories;

import com.yongzheng.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
