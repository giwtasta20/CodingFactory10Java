package gr.aueb.cf.ch18ch19.bankapp.dto;

import java.math.BigDecimal;

public record AccountWithdrawDTO(String iban, BigDecimal amount) {
}