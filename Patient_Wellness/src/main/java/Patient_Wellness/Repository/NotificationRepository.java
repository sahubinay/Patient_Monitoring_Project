package Patient_Wellness.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Patient_Wellness.Entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
