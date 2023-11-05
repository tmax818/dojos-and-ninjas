package co.tylermaxwell.dojosandninjas.repositories;

import co.tylermaxwell.dojosandninjas.models.Ninja;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();
}
