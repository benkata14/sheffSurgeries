package com.bkata

class Prescription {
String pharmacyName
int prescripNumber
String medicine
double totalCost
Date dataIssued
Boolean patientPaying

    static constraints = {

pharmacyName nullable: false, blank: false
prescripNumber nullable: false, blank: false
medicine nullable: false, blank: false
totalCost nullable: false, blank: false
dataIssued nullable: false, blank: false
patientPaying nullable: false, blank: false
    }
}
