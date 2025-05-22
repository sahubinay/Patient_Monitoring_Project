package Patient_Wellness.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "progress")
@Setter
@Getter
public class Progress {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long progressId;
    
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientProfile patient;
    
    @ManyToOne
    @JoinColumn(name = "plan_id")
    private WellnessPlan plan;
    
    private String completedActivities;
	
    public PatientProfile getPatient() {
        return patient;
    }
}
