package dev.naamad.ads.repository;

import dev.naamad.ads.entities.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ListCrudRepository<Product, Long> {
}
