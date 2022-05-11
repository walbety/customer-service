package com.walbety.customer.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SampleResponse {
  private String id;
  private String hashId;
  private Integer value;
}
