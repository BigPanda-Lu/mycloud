package com.ms.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}
