package com.patarini.project.service.impl;

import com.patarini.project.model.Paytoll;
import com.patarini.project.model.User;
import com.patarini.project.model.exceptions.PaytollNotFoundException;
import com.patarini.project.model.exceptions.UserNotFoundException;
import com.patarini.project.repository.jpa.PaytollRepository;
import com.patarini.project.repository.jpa.UserRepository;
import com.patarini.project.service.PaytollService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaytollServiceImpl implements PaytollService {

    private final PaytollRepository paytollRepository;
    private final UserRepository userRepository;

    public PaytollServiceImpl(PaytollRepository paytollRepository, UserRepository userRepository) {
        this.paytollRepository = paytollRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Paytoll> listAll() {
        return paytollRepository.findAll();
    }

    @Override
    public Optional<Paytoll> findById(Long id) {
        if (!this.paytollRepository.findById(id).isPresent()) {
            throw new PaytollNotFoundException(id);
        }
        return this.paytollRepository.findById(id);
    }

    @Override
    public Optional<Paytoll> save(String name, String latitude, String longitude, String sec1, String sec2, float IA, double IAE, float IB, double IBE, float II, double IIE, float III, double IIIE, float IV, double IVE, String iframe) {
//        User user = this.userRepository.findById(userID)
//                .orElseThrow(() -> new UserNotFoundException(userID));
        return Optional.of(this.paytollRepository.save(new Paytoll(name, latitude, longitude, sec1, sec2, IA, IAE, IB, IBE, II, IIE, III, IIIE, IV, IVE, iframe)));

    }

    @Override
    public void deleteById(Long id) {
        this.paytollRepository.deleteById(id);
    }
}
