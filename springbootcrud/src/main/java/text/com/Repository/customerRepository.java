package text.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import text.com.entity.customer;

@Repository

public interface customerRepository extends JpaRepository<customer,Integer> {

}
