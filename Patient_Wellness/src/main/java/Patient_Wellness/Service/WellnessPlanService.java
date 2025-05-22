package Patient_Wellness.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Patient_Wellness.Entity.WellnessPlan;
import Patient_Wellness.Repository.WellnessPlanRepository;

@Service
public class WellnessPlanService {

	@Autowired
    private WellnessPlanRepository wellnessRepo;

    public WellnessPlan createPlan(WellnessPlan plan) {
        return wellnessRepo.save(plan);
    }

    public List<WellnessPlan> getAllPlans() {
        return wellnessRepo.findAll();
    }
}
