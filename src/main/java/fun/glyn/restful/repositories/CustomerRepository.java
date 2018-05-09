package fun.glyn.restful.repositories;

import fun.glyn.restful.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
