package fun.glyn.restful.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;

    @Before
    public void setup() {
        customer = new Customer();
    }

    @Test
    public void getFirstname() throws Exception {
        customer.setFirstname("johnson");
        assertEquals("johnson", customer.getFirstname());
    }

    @Test
    public void getLastname() throws Exception {
    }

    @Test
    public void getUrl() throws Exception {
    }

}