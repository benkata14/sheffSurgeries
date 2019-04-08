package com.bkata

class Receptionist {

String recepName
String recepEmail
String recepUsername
String recepPassword
String recepPhone

static hasMany=[surgerys: Surgery]

static belongsTo=[Surgery]

String toString(){
return recepName
}

    static constraints = {

recepName nullable: false, blank: false
recepEmail nullable: false, blank: false, email: true
recepUsername nullable: false, blank: false
recepPassword nullable: false, blank: false, password: true
recepPhone nullable: false, blank: false
    }
}
