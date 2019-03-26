package com.bkata

class BootStrap {

    def init = { servletContext ->

def Sheffield = new Surgery(
name:'Sheffield Hallam',
address:'Howard Street',
postcode:'S1 1WB',
telephone:'55333152',
numberOfPatients:34,
description:'Sheffield Hallam Uni Surgey for students',
openingTime:'9am').save()

def Manchester = new Surgery(
name:'Manchester city',
address:'Bold Street',
postcode:'M2 1WB',
telephone:'0733153132',
numberOfPatients:70,
description:'Manchesters city Surgery',
openingTime:'10am').save()

def Sarah = new Doctor(
fullName:'Dr Sarah Macdonald',
qualifications:'MBChB(Sheffield)',
position:'GP, Surgeon',
doctorEmail:'s.macdonald@myemail.com',
password:'secret222',
doctorOffice:'D-9888',
doctorPhone:'011111777',
bio:'Placeholder text').save()

def John = new Doctor(
fullName:'Dr John Keith',
qualifications:'MBChB(Sheffield)',
position:'GP, Surgeon',
doctorEmail:'j.keith@myemail.com',
password:'secret222',
doctorOffice:'D-9889',
doctorPhone:'011121777',
bio:'Placeholder text').save()


def App1 =new Appointment(
appDate:new Date('25/04/2019'),
appTime:'3:00pm',
appDuration:'40',
roomNumber:'A-1111').save()

def App2 =new Appointment(
appDate:new Date('26/04/2019'),
appTime:'2:00pm',
appDuration:'15',
roomNumber:'A-1112').save()

def Tom =new Patient(
patientName:'Tom River',
patientAddress:'2 One Way Strret, Eckington',
patientResidence:'Sheffield',
patientDob:new Date('20/09/1988'),
patientID:'E25555',
dateRegistered:new Date('26/02/2018'),
patientPhone:'0114 222 4444',
appointment:App2).save()

def Jenna =new Patient(
patientName:'Jenna Jones',
patientAddress:'109 Clough Road, Bram',
patientResidence:'Sheffield',
patientDob:new Date('10/03/1999'),
patientID:'E25556',
dateRegistered:new Date('25/01/2019'),
patientPhone:'0114 224 4247',
appointment: App1).save()

def Paracetomol =new Prescription(
pharmacyName:'City Centre Pharmacy',
prescripNumber:56788,
medicine:'Paracetomol',
totalCost:'£5.90',
dateIssued:new Date('25/05/2019'),
patientPaying:false,
daysOfSupply:360).save()

def Weed =new Prescription(
pharmacyName:'Weed Shop',
prescripNumber:420,
medicine:'Weed',
totalCost:'£4.20',
dateIssued:new Date('25/02/2019'),
patientPaying:true,
daysOfSupply:420).save()

def Emma =new Receptionist(
recepName:'Emma Clarke',
recepEmail:'e.clarke@myemail.com',
recepUsername:'eclarke',
recepPassword:'secret2019',
recepPhone:'0114 222 4445').save()

def Rob =new Receptionist(
recepName:'Rob Kingston',
recepEmail:'r.Kingston@myemail.com',
recepUsername:'rking',
recepPassword:'secret2019',
recepPhone:'0114 222 4445').save()

def Susan =new Nurse(
nurseName:'Susan Peters',
qualifications:'Registered General Nurse',
nurseEmail:'s.peters@myemail.com',
nurseOffice:'B-455',
nursePhone:'0114 222 4433').save()

def Diane =new Nurse(
nurseName:'Diane Kata',
qualifications:'Registered General Nurse',
nurseEmail:'d.kata@myemail.com',
nurseOffice:'B-1',
nursePhone:'0114 222 4437').save()

Sheffield.addToReceptionists(Rob)
Sheffield.addToNurses(Susan)
Sheffield.addToDoctors(Sarah)
Sheffield.addToAppointments(App1)
Sheffield.addToPatients(Jenna)
Sheffield.addToPatients(Tom)
Manchester.addToReceptionists(Emma)
Manchester.addToDoctors(John)
Manchester.addToNurses(Diane)
Sarah.addToNurses(Susan)
Sarah.addToPatients(Tom)
Sarah.addToPatients(Jenna)
Sarah.addToAppointments(App1)
Sarah.addToPrescriptions(Paracetomol)
John.addToNurses(Diane)
John.addToAppointments(App2)
John.addToPrescriptions(Weed)
Tom.addToPrescriptions(Paracetomol)
Jenna.addToPrescriptions(Paracetomol)








    }
    def destroy = {
    }
}
