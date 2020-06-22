package com.example.labs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="phones")
public class Phone {
    @Id
    @Column(name="phone_id")
    private UUID id;
    private String operator;
    private String counts;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts;
    }
}
