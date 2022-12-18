package by.Nikonchuk.kpop.repositories;

import by.Nikonchuk.kpop.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
