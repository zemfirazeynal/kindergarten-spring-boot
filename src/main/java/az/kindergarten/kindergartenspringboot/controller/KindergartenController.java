
package az.kindergarten.kindergartenspringboot.controller;


import az.kindergarten.kindergartenspringboot.model.Kid;
import az.kindergarten.kindergartenspringboot.service.KidService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("kid")
@RequiredArgsConstructor
@Slf4j
public class KindergartenController {

    private final KidService kidService;

    @PostMapping
    public Kid create(@RequestBody Kid kid){
        log.info("Call Create Command!");
        return kidService.create(kid);
    }

    @GetMapping
    public Set<Kid> kids(){
        log.info("Call Get Command!");
        return kidService.kids();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        log.info("Call Delete Command!");
        kidService.delete(id);
    }

    @PutMapping("/{id}")
    public Kid update(@PathVariable Long id, @RequestBody Kid kid){
        log.info("Call Update Command!");
        return kidService.update(id, kid);
    }
}
