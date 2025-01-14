package models;

public class Patient {
    int patientId;
    String patientName;
    String patientType;
    int numberOfDaysInHospital;
float totalBedCharge;
    public Patient(String patientName, String patientType, int patientId, int numberOfDaysInHospital) {
        this.patientName = patientName;
        this.patientType = patientType;
        this.patientId = patientId;
        this.numberOfDaysInHospital = numberOfDaysInHospital;

    }
    public String getPatientName(){
        return patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getNumberOfDaysInHospital() {
        return numberOfDaysInHospital;
    }

    public String getPatientType() {
        return patientType;
    }
public  float getTotalBedCharge(){
        return totalBedCharge;
}

    public String toString() {
        return patientId + " " + patientType + " " + numberOfDaysInHospital;
    }
}
