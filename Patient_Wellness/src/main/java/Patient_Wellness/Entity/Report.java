package Patient_Wellness.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reports")
public class Report {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;
    
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientProfile patient;
    
    private String summary;
    private LocalDate date;
    
    public PatientProfile getPatient() {
        return patient;
    }
}
