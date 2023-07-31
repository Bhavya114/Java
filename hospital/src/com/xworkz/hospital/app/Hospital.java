package com.xworkz.hospital.app;

public class Hospital {

public String name="KMC";

public Doctor doctor=new Doctor();
public Nurse nurse=new Nurse();
public Patient patient=new Patient();

public void provideTreatment() {
	
System.out.println("Invoking provideTreatment in Hospital ");
System.out.println("*********************************");

if(this.doctor!=null) {
	this.doctor.counselPatient();
	this.doctor.giveTreatment();
}
else {
	System.out.println("Cannot access Doctor");
}
System.out.println("*********************************");
if(this.nurse!=null) {
	this.nurse.patientCare();
	this.nurse.maintainPatientRecord();
}
else {
	System.out.println("Cannot access Nurse");

}
System.out.println("*********************************");

if(this.patient!=null) {
	this.patient.consultDoctor();
	this.patient.paidFees();
	
}
else {
	System.out.println("Cannot access Patient");

}
}

public void info() {
	System.out.println("Hospital name: "+name);

}
}
