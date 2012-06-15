package com.iai

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Vehicle)
class VehicleTests {

    void testSomething() {
		def accordModel = new VehicleModel(name: 'Accord', packageName: 'LX')
		def hondaAccord = new Vehicle(
		                make: "Honda",
						model: accordModel,
						year: 2006)

		mockForConstraintsTests(Vehicle, [hondaAccord])
		assert hondaAccord.make == "Honda"
				
		def newCar = new Vehicle(make: "")
		assert !newCar.validate()
		assert "nullable" == newCar.errors["model"]
		assert "blank" == newCar.errors["make"]
		       
		def oldCar = new Vehicle(make: 'Acura', model: 'Integra', year: 2000)
    }
}
