package com.iai

import static org.junit.Assert.*
import org.junit.*
import grails.test.mixin.*
import com.gmongo.GMongo

import org.apache.commons.logging.LogFactory

class VehicleInMongoTests extends GroovyTestCase {

	Vehicle accord
	Vehicle tsx
	Comparison comparison
	User somebody
	def db
	def mongo
	
	def log = LogFactory.getLog(VehicleInMongoTests) 
	
    @Before
    void setUp() {
	
		//def mongo = new GMongo()
        // Setup logic here
		def accordModel = new VehicleModel(name: "Accord", packageName: "LX", engine: "4cyl")
		accord = new Vehicle(model: accordModel, make: "Honda", year: 2006)
		
		def tsxModel = new VehicleModel(name: "TSX", packageName: "Type-S", engine: "v6")
		tsx = new Vehicle(model: tsxModel, make: "Acura", year: 2009)
		
		somebody = new User(name: 'andy', password: '123', totalComparisons: 3)
		comparison = new Comparison(optionOne: accord, optionTwo: tsx, user: somebody)
		
		// Get a db reference in the old fashion way
		//db = mongo.getDB("car-compare-db")
		log.debug('trying to get the name of collection: ' + mongo.getDB('car-compare-db').getCollection('vehicle'))
		//println('hello' + this.getClass())
		log.debug(mongo.getDB('car-compare-db').getStats())
	
    }

    @After
    void tearDown() {
        // Tear down logic here
		log.debug('tear down')
		//mongo.getDB('car-compare-db').getCollection('vehicle').drop()


    }

    @Test
    void testVehiclesAreSaved() {
		log.debug('*** Test if vehicles are save to DB ***');
		
		accord.save(flush: true)
		tsx.save(flush: true)
		log.debug('size of docs in collection: ' + mongo.getDB('car-compare-db').getCollection('vehicle').count())
		
		log.debug('*** test if comparison and user info is saved')
		assert comparison != null
		assert somebody != null
		somebody.comparisons = [comparison]
		//comparison.save(flush: true)
		somebody.save(flush: true)
		
		log.debug('size of docs in collection: ' + mongo.getDB('car-compare-db').getCollection('vehicle').count())
		log.debug('Getting stats ' + mongo.getDB('car-compare-db').getStats())
		
		//def vehicle = db.vehicle.findOne() 
		def vehicle = Vehicle.findByMake("Honda")
		
		assert vehicle.make == "Honda"
		assert vehicle.model.name == "Accord"
		
		def someUser = User.findByName('andy')
		assert someUser.name == 'andy'
		
    }
}
