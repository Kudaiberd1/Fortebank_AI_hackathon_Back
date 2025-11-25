package com.fortebank.AI_Hackathon.controller;

import com.fortebank.AI_Hackathon.DTO.Transaction.EvaluateTransactionRequestDto;
import com.fortebank.AI_Hackathon.DTO.Transaction.EvaluateTransactionResponseDto;
import com.fortebank.AI_Hackathon.DTO.Transaction.MetricsDto;
import com.fortebank.AI_Hackathon.entities.FraudWallet;
import com.fortebank.AI_Hackathon.repository.FraudWalletRepository;
import com.fortebank.AI_Hackathon.service.EvaluateTransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/transaction")
public class TransactionController {

    private final EvaluateTransactionService evaluateTransactionService;
    private final FraudWalletRepository fraudWalletRepository;

    @PostMapping()
    public ResponseEntity<EvaluateTransactionResponseDto> EvaluateTransaction(@RequestBody EvaluateTransactionRequestDto evaluateTransactionRequestDto){
        EvaluateTransactionResponseDto result = evaluateTransactionService.evaluate(evaluateTransactionRequestDto);

        return ResponseEntity.ok(result);
    }

    @GetMapping("/fraud-wallets")
    public ResponseEntity<List<FraudWallet>> getAllTransactions(){
        List<FraudWallet> wallets = fraudWalletRepository.findAll();

        return ResponseEntity.ok(wallets);
    }

    @GetMapping("/metrics")
    public ResponseEntity<MetricsDto>  getTransactionMetrics(){
        MetricsDto metric = evaluateTransactionService.getMetrics();

        return ResponseEntity.ok(metric);
    }

}
