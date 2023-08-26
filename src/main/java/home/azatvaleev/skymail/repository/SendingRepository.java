package home.azatvaleev.skymail.repository;

import home.azatvaleev.skymail.model.Sending;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SendingRepository extends JpaRepository<Sending, Long> {
}
