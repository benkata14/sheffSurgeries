package com.bkata

class Surgery {

String name
String address
String postcode
int telephone
int numberOfPatients
String description
String openingTime


    static constraints = {

name nullable: false, blank: false
address nullable: false, blank: false
postcode nullable: false, blank: false
telephone nullable: false, blank: false
numberOfPatients nullable: false, blank: false, min: 1, max: 100
description widget:'textarea',nullable: false, blank: false, maxsize: 5000
openingTime nullable: false, blank: false
    }
}
