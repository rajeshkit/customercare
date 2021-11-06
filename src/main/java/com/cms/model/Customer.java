package com.cms.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer implements Serializable{

	private int customerId;
	private String customerName;
	private String customerCity;
	private String customerPhone;
	private String customerPassword;
	private Long balance;

}
