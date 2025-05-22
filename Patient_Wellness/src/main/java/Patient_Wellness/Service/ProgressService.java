package Patient_Wellness.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Patient_Wellness.Entity.Progress;
import Patient_Wellness.Repository.ProgressRepository;

@Service
public class ProgressService {

	@Autowired
    private ProgressRepository progressRepo;

    public Progress trackProgress(Progress progress) {
        return progressRepo.save(progress);
    }

    public List<Progress> getProgressByPatient(Long patientId) {
        return progressRepo.findAll().stream()
                .filter(p -> p.getPatient().getPatientId().equals(patientId))
                .collect(Collectors.toList());
    }
}
