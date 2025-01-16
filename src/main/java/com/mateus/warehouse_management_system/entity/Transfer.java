package com.mateus.warehouse_management_system.entity;

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

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transfers")
@EntityListeners(AuditingEntityListener.class)
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "transfer_quantity")
    private int transferQuantity;

    @Column(name = "expected_date")
    private LocalDateTime expectedDate;

    @Column(name = "sent_date")
    private LocalDateTime sentDate;

    @CreatedDate
    @Column(name = "received_date")
    private LocalDateTime receivedDate;

    @LastModifiedDate
    @Column(name = "update_date")
    private LocalDateTime updateDate;

    @CreatedBy
    @Column(name = "created_by")
    private String createdBy;

    @LastModifiedBy
    @Column(name = "update_by")
    private String updatedBy;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transfer transfer = (Transfer) o;
        return Objects.equals(id, transfer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
