package Patient_Wellness.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Patient_Wellness.Entity.PatientProfile;
import Patient_Wellness.Service.PatientProfileService;

@RestController
@RequestMapping("/api/patients")
public class PatientProfileController {

	@Autowired
    private PatientProfileService patientService;

    @PostMapping("/register")
    public ResponseEntity<PatientProfile> registerPatient(@RequestBody PatientProfile patient) {
        return ResponseEntity.ok(patientService.registerPatient(patient));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PatientProfile> getPatient(@PathVariable Long id) {
        return patientService.getPatientById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
