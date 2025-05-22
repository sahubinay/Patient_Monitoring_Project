package Patient_Wellness.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Patient_Wellness.Entity.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

}
