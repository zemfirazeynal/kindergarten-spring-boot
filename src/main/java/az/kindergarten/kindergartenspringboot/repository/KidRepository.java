package az.kindergarten.kindergartenspringboot.repository;

import az.kindergarten.kindergartenspringboot.model.Kid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KidRepository extends JpaRepository< Kid, Long> {
}
