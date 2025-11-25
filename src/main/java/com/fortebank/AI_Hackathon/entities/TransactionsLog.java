package com.fortebank.AI_Hackathon.entities;

import com.fortebank.AI_Hackathon.entities.enums.Recommendation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transactions_log")
public class TransactionsLog {
    @Id
    private String txId = UUID.randomUUID().toString();

    @Column(name = "wallet_address")
    private String walletAddress;

    @Column(name = "amaount")
    private Float amaount;

    @Column(name = "ml_probability")
    private Float mlProbability;


    @Column(name = "system_recommendation")
    @Enumerated(EnumType.STRING)
    private Recommendation systemRecommendation;


    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
