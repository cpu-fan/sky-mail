package home.azatvaleev.skymail.repository;

import home.azatvaleev.skymail.model.PostOffice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostOfficeRepository extends JpaRepository<PostOffice, Long> {
}
