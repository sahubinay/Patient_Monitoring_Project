package Patient_Wellness.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Patient_Wellness.Entity.WellnessPlan;
import Patient_Wellness.Service.WellnessPlanService;

@RestController
@RequestMapping("/api/plans")
public class WellnessPlanController {

	@Autowired
    private WellnessPlanService wellnessService;

    @PostMapping("/create")
    public ResponseEntity<WellnessPlan> createPlan(@RequestBody WellnessPlan plan) {
        return ResponseEntity.ok(wellnessService.createPlan(plan));
    }

    @GetMapping
    public ResponseEntity<List<WellnessPlan>> getAllPlans() {
        return ResponseEntity.ok(wellnessService.getAllPlans());
    }
}
