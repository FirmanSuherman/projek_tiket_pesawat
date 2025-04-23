package com.projekan.tiket_pesawat.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal totalHarga;

    private String kodeBooking;

    @ManyToOne
    @JoinColumn(name = "penerbangan_id", nullable = false)
    private Penerbangan penerbangan;

    @ManyToOne
    @JoinColumn(name = "penumpang_id",nullable = false)
    private Penumpang penumpang;

    @Enumerated(EnumType.STRING)
    private StatusPembayaran statusPembayaran;

    private LocalDateTime waktuBooking;

    private LocalDateTime waktuPembayaran;

    private LocalDateTime batasWaktuPembayaran;

    @OneToOne(mappedBy = "booking")
    private Tiket tiker;

}
