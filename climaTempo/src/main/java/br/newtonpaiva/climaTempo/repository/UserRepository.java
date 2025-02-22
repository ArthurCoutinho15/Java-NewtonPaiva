package br.newtonpaiva.climaTempo.repository;

import br.newtonpaiva.climaTempo.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<UserEntity,String> {


    List<UserEntity> findByCountry(String country);
    List<UserEntity> findByEmailIgnoreCase(String email);
}
