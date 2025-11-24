package com.fortebank.AI_Hackathon.service;

import com.fortebank.AI_Hackathon.DTO.User.UserDto;
import com.fortebank.AI_Hackathon.entities.User;
import com.fortebank.AI_Hackathon.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {


    private final UserRepository userRepository;

    public void registerUser(UserDto accountInfo) {
        User user = new User();
        user.setBankId(accountInfo.getBanckId());
        user.setPassword(accountInfo.getPassword());

        userRepository.save(user);
    }


    public User loginUser(UserDto account) {
        User user = userRepository.findByBankIdAndPassword(account.getBanckId(), account.getPassword());

        if(user == null){
            throw new IllegalArgumentException("Somthing went wrong");
        }

        return user;
    }
}
