package fun.glyn.restful.bootstrap;

import fun.glyn.restful.domain.Category;
import fun.glyn.restful.domain.Customer;
import fun.glyn.restful.domain.Vendor;
import fun.glyn.restful.repositories.CategoryRepository;
import fun.glyn.restful.repositories.CustomerRepository;
import fun.glyn.restful.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;
    private CustomerRepository customerRepository;
    private VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);

        Customer alice = new Customer();
        alice.setFirstname("alice");
        alice.setLastname("smith");
        alice.setUrl("http://alice.com");

        Customer tom = new Customer();
        tom.setFirstname("tom");
        tom.setLastname("jackson");
        tom.setUrl("http://tom.com");

        customerRepository.save(alice);
        customerRepository.save(tom);

        loadVendors();

        System.out.println("Loaded categories : " + categoryRepository.count());
        System.out.println("Loaded customers : " + customerRepository.count());
    }

    void loadVendors() {
        Vendor vendor1 = new Vendor();
        vendor1.setName("Western Tasty Fruits Ltd.");
        Vendor vendor2 = new Vendor();
        vendor2.setName("Exotic Fruits Company");
        Vendor vendor3 = new Vendor();
        vendor3.setName("Home Fruits");

        vendorRepository.save(vendor1);
        vendorRepository.save(vendor2);
        vendorRepository.save(vendor3);

        System.out.println("Loaded Vendors : " + vendorRepository.count());
    }
}
