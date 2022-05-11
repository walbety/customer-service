package com.walbety.customer.controller;

import com.walbety.customer.controller.model.CustomerResponse;
import com.walbety.customer.model.AccountType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

  @GetMapping("/search-all")
  public List<CustomerResponse> getAll() {
    List<CustomerResponse> response = new ArrayList<>();

    response.add(
        CustomerResponse.builder()
            .id(UUID.randomUUID())
            .active(true)
            .type(AccountType.BASIC)
            .firstName("John")
            .lastName("Cena")
            .createdAt(OffsetDateTime.now().minusDays(3))
            .gender("male")
            .build());
    return response;
  }
}
