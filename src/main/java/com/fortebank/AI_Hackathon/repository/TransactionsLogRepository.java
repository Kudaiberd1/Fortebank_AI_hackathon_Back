package com.fortebank.AI_Hackathon.repository;

import com.fortebank.AI_Hackathon.entities.TransactionsLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsLogRepository extends JpaRepository<TransactionsLog, Long> {
}
