package com.iai

class VehicleModel {

	/* ie the 'xi' in 323xi or the 'XT' in Forester XT */
	String name
	String packageName 
	String engine
	
    static constraints = {
		name blank: false
		packageName nullable: true
		engine nullable: true
    }
}
