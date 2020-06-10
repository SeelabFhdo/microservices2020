package de.fhdo.online_shop.customerservice.domian

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class Customer (
        @Id
        @GeneratedValue
        var id : Long?,
        var lastname : String,
        var firstname : String,
        var email :  String,
        var password : String
)