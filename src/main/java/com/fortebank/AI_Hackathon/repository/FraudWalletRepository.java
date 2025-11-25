package com.fortebank.AI_Hackathon.repository;

import com.fortebank.AI_Hackathon.entities.FraudWallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudWalletRepository extends JpaRepository<FraudWallet, Long> {
    FraudWallet findByWalletAddress(String walletAddress);
}
