package fun.glyn.restful.services;

import fun.glyn.restful.api.v1.model.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerById(long id);
    CustomerDTO createCustomer(CustomerDTO customerDTO);
    CustomerDTO saveCustomer(Long id, CustomerDTO customerDTO);
    CustomerDTO patchCustomer(Long id, CustomerDTO customerDTO);
    void deleteCustomer(Long id);

}
