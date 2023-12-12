package Repositories;

import Model.Moeda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoedaRepository extends CrudRepository<Moeda,Integer> {
}
