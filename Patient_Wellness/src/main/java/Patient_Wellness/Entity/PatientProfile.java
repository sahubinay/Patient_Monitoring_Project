package Patient_Wellness.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "patient_profiles")
@Setter
@Getter
public class PatientProfile {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    
    private String name;
    private int age;
    private String contactDetails;
    private String medicalHistory;
}
