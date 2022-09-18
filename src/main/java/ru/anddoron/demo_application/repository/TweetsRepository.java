package ru.anddoron.demo_application.repository;

import org.springframework.data.repository.CrudRepository;
import ru.anddoron.demo_application.model.Tweets;

import java.util.List;

public interface TweetsRepository extends CrudRepository<Tweets,Long> {
    List<Tweets> findAllByUserId(Long userId);
}
