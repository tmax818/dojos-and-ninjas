package co.tylermaxwell.dojosandninjas.services;

import co.tylermaxwell.dojosandninjas.models.Dojo;
import co.tylermaxwell.dojosandninjas.repositories.DojoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {

    @Autowired
    DojoRepository dojoRepository;

    public Dojo getOneDojo(Long id) {
        Optional<Dojo> oDojo = dojoRepository.findById(id);
        return oDojo.orElse(null);
    }

    public Dojo addNewDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }

    public List<Dojo> getAllDojos() {
        return dojoRepository.findAll();
    }
}
