package com.bkata

class Prescription {
String pharmacyName
int prescripNumber
String medicine
String totalCost
Date dateIssued
Boolean patientPaying
int daysOfSupply

String toString(){
return pharmacyName
}

    static constraints = {

pharmacyName nullable: false, blank: false
prescripNumber nullable: false, blank: false
medicine nullable: false, blank: false
totalCost nullable: false, blank: false
dateIssued nullable: false, blank: false
patientPaying nullable: false, blank: false
daysOfSupply nullable: false, blank: false
    }
}
