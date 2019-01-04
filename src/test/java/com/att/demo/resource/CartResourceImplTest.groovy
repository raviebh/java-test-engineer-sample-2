package com.att.demo.resource

import com.att.demo.model.Cart
import com.att.demo.model.Item
import org.springframework.http.ResponseEntity
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class CartResourceImplTest extends Specification {

    CartResourceImpl mockCartController

    @Shared
    Item item = new Item(1, 123, 'somestring', 'product1', "1", "20")
    @Shared
    Cart cart = new Cart(1, "2018-11-12", "2018-11-13", null)

    def setup() {
        mockCartController = new CartResourceImpl()
    }

    def "add to cart - Success"() {
        setup:
        ArrayList aList = new ArrayList()
        aList.add(item)
        cart.items = aList
        Item item1 = new Item(1, 123, 'somestring', 'product1', "1", "20")

        when:
        ResponseEntity responseEntity = mockCartController.addtoCart("1", item1)

        then:
        responseEntity.statusCode == 200

    }


    def "add to cart - Error Scenario"() {


    }

    def "get Cart List Success"() {
        when:
        ResponseEntity responseEntity = mockCartController.getCartDetails("1")

        then:
        responseEntity.statusCode == "200"
    }

    @Unroll
    def "get Cart List Exception scenario"() {
        when:
        ResponseEntity responseEntity = mockCartController.getCartDetails(cartId)

        then:

        responseEntity.body

        where:
        cartId      | expectedStatus | errorMessage
        null        | 400            | "CartId cannot be Null"
        "2"         | 404            | "Cart Details not Found"
        "something" | 400            | "Invalid Cart Id"

    }

    def "remove item from cart - success"() {

    }

    def "remove item from cart - Error Scenario"() {

    }

    def "update item from cart by adding quantity"() {


    }


}
