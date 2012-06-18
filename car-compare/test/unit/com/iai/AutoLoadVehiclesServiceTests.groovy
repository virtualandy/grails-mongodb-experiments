package com.iai

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(AutoLoadVehiclesService)
@Mock([Vehicle])
class AutoLoadVehiclesServiceTests {
	
    void testLoadAndSave() {
		AutoLoadVehiclesService alvs = new AutoLoadVehiclesService()
		def id = alvs.loadAndSave()
		assert id != null
		Vehicle v = alvs.get(id)
		assert v != null
		assert v.make == 'Honda'
		
		def vehicleModel = new VehicleModel(name: "RAV4", packageName: "AWD", engine: "v6")
		new Vehicle(make: "Toyota", model: vehicleModel, year: 2010).save(true)
	}
}
