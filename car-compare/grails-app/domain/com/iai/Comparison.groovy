package com.iai

import org.bson.types.ObjectId

class Comparison {
	
	ObjectId id
	Vehicle optionOne
	Vehicle optionTwo
	Date presented
	String vehicleSelected
	
	static belongsTo = [user:User]

    static constraints = {
    }
}
