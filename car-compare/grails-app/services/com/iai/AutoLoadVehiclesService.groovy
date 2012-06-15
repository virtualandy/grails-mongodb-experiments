package com.iai

class AutoLoadVehiclesService {

    def loadAndSave() {
	// autoload a bunch of vehicles, then save them to DB
		def vehicleModel = new VehicleModel(name: "Element", packageName: "EX", engine: "4cyl")
		Vehicle toLoad = new Vehicle(make: "Honda", model: vehicleModel, year: 2008)
		toLoad.save(flush: true)
		toLoad.id 
    }

	Vehicle get (id) {
		Vehicle v = Vehicle.get(id)
	}
}
