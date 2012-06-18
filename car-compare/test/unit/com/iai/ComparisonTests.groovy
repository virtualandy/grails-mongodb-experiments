package com.iai

import grails.test.mixin.*
import org.junit.*
import static org.junit.Assert.*

import com.gmongo.GMongo


/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Comparison)
@Mock([Vehicle, VehicleModel])
class ComparisonTests extends GroovyTestCase {

	def camry, tsx
	
	@Before
	void setup() {

		//def mongo = new GMongo()
	    // Setup logic here
		def camryModel = new VehicleModel(name: "Camry", packageName: "XLE", engine: "v6")
		camry = new Vehicle(model: camryModel, make: "Toyota", year: 2012)

		def tsxModel = new VehicleModel(name: "TSX", packageName: "Type-S", engine: "v6")
		tsx = new Vehicle(model: tsxModel, make: "Acura", year: 2009)

		// Get a db reference in the old fashion way
		//db = mongo.getDB("car-compare-db")
		//log.debug('trying to get the name of collection: ' + mongo.getDB('car-compare-db').getCollection('vehicle'))
		//println('hello' + this.getClass())
		//log.debug(mongo.getDB('car-compare-db').getStats())
		
	}
    void testSomething() {
		//camry.save(flush: true)
	//	tsx.save(flush: true)
		
		def comparison = new Comparison(optionOne: camry, optionTwo: tsx)
		comparison.save()
		
		def found = Comparison.findByVehicleSelected('camry') 
		assert found != null
	}
}
