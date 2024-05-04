package io.umid.logistictask.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Delivery {

    @Id
    private String id;

    private LocalDateTime edt;

    @ManyToOne
    private User owner;

    @ManyToOne
    private Product product;

    @OneToMany(mappedBy = "delivery")
    private List<DeliveryLocation> locations;

    private Integer productCount;

    private String productMeasure;

    private String transport;

    private String originLocation;

    private String destinationLocation;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    private LocalDateTime createdAt;

}
