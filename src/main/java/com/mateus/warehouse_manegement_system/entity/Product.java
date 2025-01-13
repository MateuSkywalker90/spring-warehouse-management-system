package com.mateus.warehouse_manegement_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
@EntityListeners(AuditingEntityListener.class)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code", nullable = false, length = 10, unique = true)
    private String code;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", length = 200)
    private String description;

    @Column(name = "category", nullable = false, length = 100)
    private String category;

    @Column(name = "weight", nullable = false)
    private BigDecimal weight;

    @Column(name = "height", nullable = false)
    private BigDecimal height;

    @Column(name = "width", nullable = false)
    private BigDecimal width;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "refrigerated")
    private boolean refrigerated;

    @CreatedDate
    @Column(name = "create_date")
    private LocalDateTime createDate;

    @LastModifiedDate
    @Column(name = "update_date")
    private LocalDateTime updateDate;

    @CreatedBy
    @Column(name = "created_by")
    private String createdBy;

    @LastModifiedBy
    @Column(name = "update_by")
    private String updatedBy;

    @ManyToOne
    @JoinColumn(name = "id_order_detail")
    private OrderDetail orderDetail;

    @ManyToOne
    @JoinColumn(name = "id_delivery_detail")
    private DeliveryDetail deliveryDetail;

    @ManyToOne
    @JoinColumn(name = "id_inventory")
    private Inventory inventory;

    @ManyToOne
    @JoinColumn(name = "id_transfer")
    private Transfer transfer;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
