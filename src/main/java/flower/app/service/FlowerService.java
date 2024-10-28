package flower.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flower.app.model.Flower;
import flower.app.repository.FlowerRepository;

@Service
public class FlowerService {

    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }

    public Flower createFlower(Flower flower){
        return flowerRepository.save(flower);
    }
}

