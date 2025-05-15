package br.com.fiap.MottuBracelet.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank
    private String imei;

    @NotBlank
    private String chassi;

    @NotBlank
    private String placa;

    @ManyToOne
    @JoinColumn(name = "patio_id")
    private Patio patio;

    @OneToOne(mappedBy = "moto", cascade = CascadeType.ALL)
    private Dispositivo dispositivo;

    public Moto() {
    }

    public Moto(Long id, String imei, String chassi, String placa, Patio patio, Dispositivo dispositivo) {
        this.id = id;
        this.imei = imei;
        this.chassi = chassi;
        this.placa = placa;
        this.patio = patio;
        this.dispositivo = dispositivo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Patio getPatio() {
        return patio;
    }

    public void setPatio(Patio patio) {
        this.patio = patio;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
}
