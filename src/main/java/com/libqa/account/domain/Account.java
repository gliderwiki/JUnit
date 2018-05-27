package com.libqa.account.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author : yion
 * @Date : 2017. 4. 15.
 * @Description :
 */
@Data
public class Account {
    String name;
    String description;
    List<Transaction> transactions;
}
