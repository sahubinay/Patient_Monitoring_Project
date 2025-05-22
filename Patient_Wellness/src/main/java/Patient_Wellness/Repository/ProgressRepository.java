package Patient_Wellness.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Patient_Wellness.Entity.Progress;

@Repository
public interface ProgressRepository extends JpaRepository<Progress, Long>{

}
