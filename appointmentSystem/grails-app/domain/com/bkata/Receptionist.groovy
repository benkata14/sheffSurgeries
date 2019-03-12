package com.bkata

class Receptionist {
String recepName
String recepEmail
String recepUsername
String recepPassword
int recepPhone

    static constraints = {

recepName nullable: false, blank: false
recepEmail nullable: false, blank: false
recepUsername nullable: false, blank: false, email: true
recepPassword nullable: false, blank: false, password: true
recepPhone nullable: false, blank: false
    }
}
