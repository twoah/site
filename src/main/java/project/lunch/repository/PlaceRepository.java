package project.lunch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import project.lunch.vo.Place;

@Repository
@EnableJpaRepositories("project.lunch.repository")
public interface PlaceRepository extends JpaRepository<Place, Integer> {
}
