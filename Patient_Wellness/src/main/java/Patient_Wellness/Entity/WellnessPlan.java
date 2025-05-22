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
@Table(name = "wellness_plans")
@Setter
@Getter
public class WellnessPlan {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;
    
    private String planName;
    private String activities;
    
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientProfile assignedTo;
}
