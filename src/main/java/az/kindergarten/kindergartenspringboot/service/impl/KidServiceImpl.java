package az.kindergarten.kindergartenspringboot.service.impl;

import az.kindergarten.kindergartenspringboot.model.Kid;
import az.kindergarten.kindergartenspringboot.repository.KidRepository;
import az.kindergarten.kindergartenspringboot.service.KidService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class KidServiceImpl implements KidService {

    private final KidRepository kidRepository;

    @Override
    public Kid create(Kid kid){
        return kidRepository.save(kid);
    }

    @Override
    public Set<Kid> kids(){
        List<Kid> all = kidRepository.findAll();
        return new HashSet <> (all);
    }

    @Override
    public void delete(Long id){
        Kid kid = kidRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Kid Not Found!"));
        kidRepository.delete(kid);
    }

    @Override
    public Kid update(Long id, Kid kidNew){
        Kid kid = kidRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Kid Not Found!"));
        kidNew.setKidId(kid.getKidId());
        return kidRepository.save(kidNew) ;
    }
}
