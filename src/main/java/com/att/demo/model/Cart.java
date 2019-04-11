package com.att.demo.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@ApiModel(value = "Cart",
description = "Cart domain object")
@Entity
public class Cart implements Serializable{
	 
}
