package com.fortebank.AI_Hackathon.entities;

import com.fortebank.AI_Hackathon.entities.enums.Recommendation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transactions_log")
public class TransactionsLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tx_id;

    @Column(name = "wallet_address")
    private String walletAddress;

    @Column(name = "amaount")
    private Integer amaount;

    @Column(name = "ml_probability")
    private Float mlProbability;

    @Column(name = "wallet_flag")
    private Boolean walletFlag;

    @Column(name = "system_recommendation")
    @Enumerated(EnumType.STRING)
    private Recommendation systemRecommendation;

    @Column(name = "user_decision")
    private String userDecision;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
