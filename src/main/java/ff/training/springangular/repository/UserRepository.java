package ff.training.springangular.repository;

import ff.training.springangular.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {}
