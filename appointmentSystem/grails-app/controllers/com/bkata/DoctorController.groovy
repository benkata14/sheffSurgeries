package com.bkata

class DoctorController {

    def scaffold= Doctor


def login(){

}


def validate(){

 def user = Receptionist.findBydoctorEmail(params.email)

 if(user && user.password == params.password){

	session.user = user
	render view:'home'

}

else{

	flash.message = "Invaild username and password."

	render view:'login'
}
}

def logout = {
	session.user = null

	redirect(uri:'/')

}

}
