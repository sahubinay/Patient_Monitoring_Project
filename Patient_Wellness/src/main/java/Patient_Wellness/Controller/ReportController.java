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

import Patient_Wellness.Entity.Report;
import Patient_Wellness.Service.ReportService;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

	@Autowired
    private ReportService reportService;

    @PostMapping("/generate")
    public ResponseEntity<Report> generateReport(@RequestBody Report report) {
        return ResponseEntity.ok(reportService.generateReport(report));
    }

    @GetMapping("/{patientId}")
    public ResponseEntity<List<Report>> getReports(@PathVariable Long patientId) {
        return ResponseEntity.ok(reportService.getReportsByPatient(patientId));
    }
}
