package Patient_Wellness.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Patient_Wellness.Entity.WellnessPlan;

@Repository
public interface WellnessPlanRepository extends JpaRepository<WellnessPlan, Long> {

}
