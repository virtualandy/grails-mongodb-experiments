package com.iai

import org.bson.types.ObjectId

class User {

	ObjectId id
	String name
	String password
	Integer totalComparisons
	
	static hasMany = [comparisons:Comparison]
	
    static constraints = {
	
    }
}
