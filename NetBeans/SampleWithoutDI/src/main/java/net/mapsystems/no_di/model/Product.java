/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.no_di.model;

import java.math.BigDecimal;

/**
 *
 * @author mpisching
 */
public class Product {
    private String name;
    private BigDecimal totalValue;

    public Product(String name, BigDecimal totalValue) {
        this.name = name;
        this.totalValue = totalValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }
    
    
}
