package com.crud.code_shadowing.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class OrderRequest {

    @NotNull(message = "상품 ID는 필수입니다.")
    private Long productId;
}