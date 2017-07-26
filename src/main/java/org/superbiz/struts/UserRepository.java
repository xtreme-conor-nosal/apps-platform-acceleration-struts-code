package org.superbiz.struts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pivotal on 7/26/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
