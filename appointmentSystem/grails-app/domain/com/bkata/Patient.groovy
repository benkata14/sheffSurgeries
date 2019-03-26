package com.bkata

class Patient {
String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
String patientPhone
Appointment appointment

static hasMany=[prescriptions: Prescription, doctors: Doctor, surgerys: Surgery]

static belongsTo=[Doctor, Surgery]


    static constraints = {

patientName nullable: false, blank: false
patientAddress nullable: false, blank: false
patientResidence nullable: false, blank: false
patientDob nullable: false, blank: false
patientID nullable: false, blank: false
dateRegistered nullable: false, blank: false
patientPhone nullable: false, blank: false

    }
}
