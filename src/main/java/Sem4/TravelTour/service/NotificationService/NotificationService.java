package Sem4.TravelTour.service.NotificationService;

import Sem4.TravelTour.entity.Notification;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import java.util.List;


public interface NotificationService  {
    List<Notification> findByOrderByIdDesc();
    boolean existsById(Long id);
    Notification save(Notification notification);
    Notification getById(Long id);

    void readAll();

}
