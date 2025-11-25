package com.fortebank.AI_Hackathon.DTO.Transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MetricsDto {

    private float precision;
    private float recall;
    private float f1;
    private float roc_auc;
    private float current_threshold;

}
