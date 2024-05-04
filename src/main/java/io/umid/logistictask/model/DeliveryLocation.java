package io.umid.logistictask.model;

import jakarta.persistence.*;

@Entity
public class DeliveryLocation {

    @Id
    private Integer id;

    private String locationName;

    @ManyToOne
    private Delivery delivery;

    private Integer order;

}
