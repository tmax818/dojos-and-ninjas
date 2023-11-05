package co.tylermaxwell.dojosandninjas.services;

import co.tylermaxwell.dojosandninjas.models.Ninja;
import co.tylermaxwell.dojosandninjas.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {

    @Autowired
    NinjaRepository ninjaRepository;

    public Ninja addNewNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }


}
