package Patient_Wellness.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Patient_Wellness.Entity.Notification;
import Patient_Wellness.Repository.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
    private NotificationRepository notificationRepo;

    public Notification sendNotification(Notification notification) {
        return notificationRepo.save(notification);
    }

    public List<Notification> getNotificationsByPatient(Long patientId) {
        return notificationRepo.findAll().stream()
                .filter(n -> n.getPatient().getPatientId().equals(patientId))
                .collect(Collectors.toList());
    }
}
