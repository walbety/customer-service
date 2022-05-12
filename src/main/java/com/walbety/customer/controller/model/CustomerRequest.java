package com.walbety.customer.controller.model;

import javax.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerRequest {
  @NotBlank private String firstname;
  @NotBlank private String lastname;
  @NotBlank private String email;
  private String phone;
  private String gender;
  @NotBlank private String birthdate;
}
