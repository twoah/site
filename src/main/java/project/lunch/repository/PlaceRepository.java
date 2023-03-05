package project.lunch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.lunch.vo.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {
}
