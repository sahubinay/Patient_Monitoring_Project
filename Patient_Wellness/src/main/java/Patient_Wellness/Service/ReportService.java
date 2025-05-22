package Patient_Wellness.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Patient_Wellness.Entity.Report;
import Patient_Wellness.Repository.ReportRepository;

@Service
public class ReportService {

	@Autowired
    private ReportRepository reportRepo;

    public Report generateReport(Report report) {
        return reportRepo.save(report);
    }

    public List<Report> getReportsByPatient(Long patientId) {
        return reportRepo.findAll().stream()
                .filter(r -> r.getPatient().getPatientId().equals(patientId))
                .collect(Collectors.toList());
    }
}
