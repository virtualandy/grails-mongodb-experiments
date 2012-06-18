package com.iai



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
@Mock([Comparison, Vehicle])
class UserTests {

    void testSomething() {
		def comparison = new Comparison(presented: new Date())
		def andy = new User(name: 'andy', comparison: comparison)
		andy.save()
		def person = User.find()
		assert person != null
    }
}
