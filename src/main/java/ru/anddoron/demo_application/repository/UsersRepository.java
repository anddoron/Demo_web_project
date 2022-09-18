package ru.anddoron.demo_application.repository;


import org.springframework.data.repository.CrudRepository;
import ru.anddoron.demo_application.model.Users;

public interface UsersRepository extends CrudRepository<Users,Long>{

}
