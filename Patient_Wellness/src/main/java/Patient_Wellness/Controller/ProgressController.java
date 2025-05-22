package Patient_Wellness.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Patient_Wellness.Entity.Progress;
import Patient_Wellness.Service.ProgressService;

@RestController
@RequestMapping("/api/progress")
public class ProgressController {

	@Autowired
    private ProgressService progressService;

    @PostMapping("/track")
    public ResponseEntity<Progress> trackProgress(@RequestBody Progress progress) {
        return ResponseEntity.ok(progressService.trackProgress(progress));
    }

    @GetMapping("/{patientId}")
    public ResponseEntity<List<Progress>> getProgress(@PathVariable Long patientId) {
        return ResponseEntity.ok(progressService.getProgressByPatient(patientId));
    }
}
