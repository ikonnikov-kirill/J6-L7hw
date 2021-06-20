package J6L7hw.service;

import J6L7hw.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer findById(int id);

}
