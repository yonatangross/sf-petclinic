package yonatangross.spring.sfpetclinic.services.map;

import org.springframework.stereotype.Service;
import yonatangross.spring.sfpetclinic.model.Vet;
import yonatangross.spring.sfpetclinic.services.VetService;

import java.util.Set;
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}
