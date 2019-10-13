package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import demo.entity.*;

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Integer> {

}