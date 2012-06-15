package com.iai

import org.bson.types.ObjectId

class Vehicle {

	ObjectId id
	VehicleModel model
	String make
	Integer year
	static embedded = ['model']
	
    static constraints = {
		make blank: false
		year size: 1900..2020
    }

	
}
