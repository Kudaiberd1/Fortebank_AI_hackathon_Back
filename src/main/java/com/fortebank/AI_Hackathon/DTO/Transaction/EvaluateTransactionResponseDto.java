package com.fortebank.AI_Hackathon.DTO.Transaction;

import com.fortebank.AI_Hackathon.entities.enums.Recommendation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EvaluateTransactionResponseDto {

    private String tx_id;
    private Float mlProbability;
    private Recommendation systemRecommendation;
}
