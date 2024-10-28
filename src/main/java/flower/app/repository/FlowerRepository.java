package flower.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flower.app.model.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer>{
    
}