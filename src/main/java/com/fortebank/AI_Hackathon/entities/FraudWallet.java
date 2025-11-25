package com.fortebank.AI_Hackathon.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fraud_wallets")
public class FraudWallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wallet_address")
    private String walletAddress;

    @Column(name = "fraud_count")
    private Integer fraudCount;

    @Column(name = "last_fraud_time")
    private LocalDate lastfraudTime;

}
