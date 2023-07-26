package dev.naamad.ads.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.naamad.ads.enums.Category;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String title;
    private Category category;
    private int price;
    @Column(unique = true)
    private String serialNumber;

}
