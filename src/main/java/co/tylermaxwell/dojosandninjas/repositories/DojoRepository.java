package co.tylermaxwell.dojosandninjas.repositories;

import co.tylermaxwell.dojosandninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();
}
