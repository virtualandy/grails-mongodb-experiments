package com.iai

class Vehicle {

	VehicleModel model
	String make
	Integer year
	static embedded = ['model']
	
    static constraints = {
		make blank: false
		year size: 1900..2020
    }

	
}
