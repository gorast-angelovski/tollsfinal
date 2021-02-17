package com.patarini.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Paytoll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String latitude;

    private String longitude;

    private String sec1;
    private String sec2;

    private float IA;
    private double IAE;
    private float IB;
    private double IBE;
    private float II;
    private double IIE;
    private float III;
    private double IIIE;
    private float IV;
    private double IVE;

    @Column(length = 511)
    private String iframe;


    public Paytoll() {
    }

    public Paytoll(String name, String latitude, String longitude, String sec1, String sec2, float IA, double IAE, float IB, double IBE, float II, double IIE, float III, double IIIE, float IV, double IVE, String iframe) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.sec1 = sec1;
        this.sec2 = sec2;
        this.IA = IA;
        this.IAE = IAE;
        this.IB = IB;
        this.IBE = IBE;
        this.II = II;
        this.IIE = IIE;
        this.III = III;
        this.IIIE = IIIE;
        this.IV = IV;
        this.IVE = IVE;
        this.iframe = iframe;
    }
}
