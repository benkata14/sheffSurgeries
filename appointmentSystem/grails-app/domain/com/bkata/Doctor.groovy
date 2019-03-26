package com.bkata

class Doctor {
String fullName
String qualifications
String position
String doctorEmail
String password
String doctorOffice
String doctorPhone
String bio

static hasMany=[prescriptions: Prescription, patients: Patient, nurses: Nurse, appointments: Appointment]

String toString(){
return fullName
}

static constraints = {

fullName nullable: false, blank: false
qualifications nullable: false, blank: false
position nullable: false, blank: false
doctorEmail nullable: false, blank: false, email:true
password nullable: false, blank: false, password: true
doctorOffice nullable: false, blank: false
doctorPhone nullable: false, blank: false
bio widget:'textarea',nullable: false, blank: false, maxSize: 5000
    }
}
