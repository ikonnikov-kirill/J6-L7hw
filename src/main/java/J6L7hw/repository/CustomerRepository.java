package J6L7hw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import J6L7hw.model.Customer;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT c FROM Customer c")
    List<Customer> findAll();

    Customer findById(int id);

}
