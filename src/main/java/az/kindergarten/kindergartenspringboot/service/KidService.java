package az.kindergarten.kindergartenspringboot.service;

import az.kindergarten.kindergartenspringboot.model.Kid;

import java.util.Set;

public interface KidService {
    Kid create(Kid kid);

    Set<Kid> kids();

    void delete(Long id);

    Kid update(Long id, Kid kid);
}
