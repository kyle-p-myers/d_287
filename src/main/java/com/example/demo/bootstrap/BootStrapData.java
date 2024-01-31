package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        // Clearing repositories for multiple test runs
        // partRepository.deleteAll();
        // productRepository.deleteAll();
        // outsourcedPartRepository.deleteAll();

        if (partRepository.count() == 0) {

            InhousePart mother100 = new InhousePart();
            mother100.setName("MSI - B550");
            mother100.setPrice(159.99);
            mother100.setInv(6);

            InhousePart mother200 = new InhousePart();
            mother200.setName("MSI - MAG Z790");
            mother200.setPrice(289.99);
            mother200.setInv(4);

            InhousePart mother300 = new InhousePart();
            mother300.setName("ASUS - ROG STRIX");
            mother300.setPrice(469.99);
            mother300.setInv(2);

            InhousePart mother400 = new InhousePart();
            mother400.setName("ASUS PRIME Z790");
            mother400.setPrice(309.99);
            mother400.setInv(10);

            InhousePart mother500 = new InhousePart();
            mother500.setName("MSI - PRO Z690");
            mother500.setPrice(164.99);
            mother500.setInv(8);

            partRepository.save(mother100);
            partRepository.save(mother200);
            partRepository.save(mother300);
            partRepository.save(mother400);
            partRepository.save(mother500);
        }

        if (outsourcedPartRepository.count() == 0) {

            OutsourcedPart case1000 = new OutsourcedPart();
            case1000.setName("H5 Elite ATX - White");
            case1000.setPrice(139.99);
            case1000.setInv(5);
            case1000.setCompanyName("NZXT");

            OutsourcedPart case2000 = new OutsourcedPart();
            case2000.setName("4000D AirFlow ATX - Black");
            case2000.setPrice(94.99);
            case2000.setInv(6);
           case2000.setCompanyName("Corsair");

            OutsourcedPart case3000 = new OutsourcedPart();
           case3000.setName("H5 - Flow ATX - Black");
            case3000.setPrice(84.99);
            case3000.setInv(9);
            case3000.setCompanyName("NZXT");

            OutsourcedPart case4000 = new OutsourcedPart();
            case4000.setName("H9 ATX Dual Chamber - Black");
            case4000.setPrice(159.99);
            case4000.setInv(3);
            case4000.setCompanyName("NZXT");

            OutsourcedPart case5000 = new OutsourcedPart();
            case5000.setName("iCUE 4000D RGB Airflow ATX - Black");
            case5000.setPrice(139.99);
            case5000.setInv(7);
            case5000.setCompanyName("Corsair");

            outsourcedPartRepository.save(case1000);
            outsourcedPartRepository.save(case2000);
            outsourcedPartRepository.save(case3000);
            outsourcedPartRepository.save(case4000);
            outsourcedPartRepository.save(case5000);
        }

        if (productRepository.count() == 0) {

            Product desktop810 = new Product("Intel Core i5", 549.99, 9);
            Product desktop820 = new Product("Intel Core i7", 1599.99, 6);
            Product desktop830 = new Product("AMD Ryzen 9", 2699.99, 12);
            Product desktop840 = new Product("Intel Core i3", 379.99, 6);
            Product desktop850 = new Product("AMD Ryzen 7", 1299.99, 15);

            productRepository.save(desktop810);
            productRepository.save(desktop820);
            productRepository.save(desktop830);
            productRepository.save(desktop840);
            productRepository.save(desktop850);
        }

    }
}



