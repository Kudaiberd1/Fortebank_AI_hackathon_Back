package com.fortebank.AI_Hackathon.repository;


import com.fortebank.AI_Hackathon.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByBankIdAndPassword(String bankId, String password);
}
