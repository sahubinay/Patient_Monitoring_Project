package Patient_Wellness.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Patient_Wellness.Entity.PatientProfile;
import Patient_Wellness.Repository.PatientProfileRepository;

@Service
public class PatientProfileService {

	@Autowired
    private PatientProfileRepository patientRepo;

    public PatientProfile registerPatient(PatientProfile patient) {
        return patientRepo.save(patient);
    }

    public Optional<PatientProfile> getPatientById(Long id) {
        return patientRepo.findById(id);
    }
}
