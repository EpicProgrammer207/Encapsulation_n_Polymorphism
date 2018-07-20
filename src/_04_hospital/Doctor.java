package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
ArrayList<Patient> patients = new ArrayList<>();
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException{
		// TODO Auto-generated method stub
		if(patients.size()>2) {
			throw new DoctorFullException();
		}
		else patients.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for(Patient p: patients) {
			p.checkPulse();
		}
	}

}
