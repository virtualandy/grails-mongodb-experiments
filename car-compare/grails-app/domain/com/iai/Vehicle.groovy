package com.iai

class Vehicle {

	String model
	String make
	Integer year
	
    static constraints = {
		model blank: false
		make blank: false
		year size: 1900..2020
    }

	
}
