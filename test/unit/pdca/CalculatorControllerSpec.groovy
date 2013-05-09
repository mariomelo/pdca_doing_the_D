package pdca

import grails.test.mixin.TestFor
import spock.lang.Specification


@TestFor(CalculatorController)
class CalculatorControllerSpec extends Specification {

	def "One number should be divided by another"() {
		when: "I divide a number by another"
			def result = controller.divide firstNumber, secondNumber

		then: "I should get the correct value"
			result == expectedResult

		where: "The values are as following"

		firstNumber		|		secondNumber		| 	expectedResult
			10			|			5			|		2
			36			|			6			|		6
			-10			|			-1 			|		10
	}
}