package com.patarini.project.service;

import com.patarini.project.model.Paytoll;
import com.patarini.project.model.User;

import java.util.List;
import java.util.Optional;

public interface PaytollService {
    List<Paytoll> listAll();

    Optional<Paytoll> findById(Long id);

    Optional<Paytoll> save(String name, String latitude, String longitude, String sec1, String sec2, float IA, double IAE, float IB, double IBE, float II, double IIE, float III, double IIIE, float IV, double IVE, String iframe);

    void deleteById(Long id);

}
