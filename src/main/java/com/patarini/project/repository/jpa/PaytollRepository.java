package com.patarini.project.repository.jpa;

import com.patarini.project.model.Paytoll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaytollRepository extends JpaRepository<Paytoll, Long> {
}
