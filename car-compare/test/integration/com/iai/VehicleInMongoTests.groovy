package com.iai

import static org.junit.Assert.*
import org.junit.*
import grails.test.mixin.*
import com.gmongo.GMongo

@TestFor(Vehicle)
class VehicleInMongoTests {

	Vehicle accord
	Vehicle tsx
	def db
	
    @Before
    void setUp() {
	
		//def mongo = new GMongo()
        // Setup logic here
		def accordModel = new VehicleModel(name: "Accord", packageName: "LX", engine: "4cyl")
		accord = new Vehicle(model: accordModel, make: "Honda", year: 2006)
		
		def tsxModel = new VehicleModel(name: "TSX", packageName: "Type-S", engine: "v6")
		tsx = new Vehicle(model: tsxModel, make: "Acura", year: 2009)
		
		// Get a db reference in the old fashion way
		//db = mongo.getDB("car-compare-db")
	
    }

    @After
    void tearDown() {
        // Tear down logic here
		disconnect()
    }

    @Test
    void testVehiclesAreSaved() {
		accord.save(flush: true)
		//def vehicle = db.vehicle.findOne() 
		def vehicle = Vehicle.findByMake("Honda")
		
		assert vehicle.make == "Honda"
		assert vehicle.model.name == "Accord"
		
    }
}
