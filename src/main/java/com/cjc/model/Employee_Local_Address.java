package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee_Local_Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int la_Id;
	private int la_Houseno;
	private String la_Landamrk;
	private String la_Areaname;
    private String la_District;
	private String la_Cityname;
	private String la_State;
	private double la_Pincode;
}
