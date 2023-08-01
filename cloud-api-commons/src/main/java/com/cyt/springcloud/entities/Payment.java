package com.cyt.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author cyt
 * @version 1.0
 */
@Data
@AllArgsConstructor // 全参
@NoArgsConstructor // 空参
public class Payment implements Serializable {
    private Long id;
    private String serial;
}