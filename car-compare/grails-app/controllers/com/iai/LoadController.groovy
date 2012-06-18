package com.iai

class LoadController {

    def index() {
	
	}
	
	def load() {
		def autoLoadService = new AutoLoadVehiclesService()
		autoLoadService.loadAndSave()
	}
	
	def find() {
		def user = User.findByName('andy')
	}
}
