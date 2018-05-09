package fun.glyn.restful.controllers.v1;

import fun.glyn.restful.services.CustomerService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CustomerControllerTest {
    CustomerController customerController;

    @Mock
    CustomerService customerService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        customerController = new CustomerController(customerService);
    }

    @Test
    public void getAllCustomers() throws Exception {

        when(customerService.getAllCustomers()).thenReturn(new ArrayList<>());

        assertEquals(customerService.getAllCustomers().size(), 0);

        verify(customerService, times(1)).getAllCustomers();
    }

    @Test
    public void getCustomerById() throws Exception {
    }

    @Test
    public void createCustomer() throws Exception {
    }

    @Test
    public void updateCustomer() throws Exception {
    }

    @Test
    public void patchCustomer() throws Exception {
    }

    @Test
    public void deleteCustomer() throws Exception {
    }

}