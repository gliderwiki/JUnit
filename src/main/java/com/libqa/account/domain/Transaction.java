package com.libqa.account.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author : yion
 * @Date : 2017. 4. 15.
 * @Description :
 */
@Setter
@Getter
public class Transaction {
    private Integer id;
    private float amount;
    private String type;
}
