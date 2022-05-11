package com.walbety.customer.controller.model;

import com.walbety.customer.model.AccountType;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerResponse {

  private UUID id;
  private String firstName;
  private String lastName;
  private String email;
  private String phone;
  private String gender;
  private LocalDateTime birthDate;
  private OffsetDateTime createdAt;
  private OffsetDateTime lastAccess;
  private Boolean active;
  private BigDecimal balance;
  private AccountType type;
}
