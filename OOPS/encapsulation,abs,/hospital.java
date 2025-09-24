// Patient.java
abstract class hospital {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId(){ return patientId; }
    public String getName(){ return name; }
    public int getAge(){ return age; }

    public void getPatientDetails(){
        System.out.println("Patient ID: "+patientId+", Name: "+name+", Age: "+age);
    }

    public abstract double calculateBill();
}

// MedicalRecord.java
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient.java
import java.util.*;

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double roomCharge;

    public InPatient(String id, String name, int age, double roomCharge){
        super(id,name,age);
        this.roomCharge = roomCharge;
    }

    @Override
    public double calculateBill(){ return roomCharge + 2000; }

    @Override
    public void addRecord(String record){ records.add(record); }

    @Override
    public void viewRecords(){ System.out.println("Medical Records: "+records); }
}

// OutPatient.java
class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();

    public OutPatient(String id, String name, int age){
        super(id,name,age);
    }

    @Override
    public double calculateBill(){ return 500; }

    @Override
    public void addRecord(String record){ records.add(record); }

    @Override
    public void viewRecords(){ System.out.println("Medical Records: "+records); }
}

// MainHospital.java
import java.util.*;

public class MainHospital {
    public static void main(String[] args){
        List<Patient> patients = new ArrayList<>();
        InPatient ip = new InPatient("P101","Alice",30,5000);
        OutPatient op = new OutPatient("P102","Bob",25);

        ip.addRecord("Surgery Done");
        op.addRecord("Regular Checkup");

        patients.add(ip);
        patients.add(op);

        for(Patient p : patients){
            p.getPatientDetails();
            System.out.println("Bill: "+p.calculateBill());
            if(p instanceof MedicalRecord){
                ((MedicalRecord)p).viewRecords();
            }
            System.out.println("--------------");
        }
    }
}
