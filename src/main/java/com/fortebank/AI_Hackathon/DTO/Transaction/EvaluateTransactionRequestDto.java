package com.fortebank.AI_Hackathon.DTO.Transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EvaluateTransactionRequestDto {
    private String wallet;
    private float amount;
    private String bankId;
    private DeviceInfoDto deviceInfo;
}
