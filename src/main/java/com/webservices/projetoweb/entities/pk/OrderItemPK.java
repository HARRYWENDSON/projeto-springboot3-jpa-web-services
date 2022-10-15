package com.webservices.projetoweb.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.webservices.projetoweb.entities.Order;
import com.webservices.projetoweb.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "Order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "Product_id")
	private Product poduct;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getPoduct() {
		return poduct;
	}
	public void setPoduct(Product poduct) {
		this.poduct = poduct;
	}
	@Override
	public int hashCode() {
		return Objects.hash(order, poduct);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(order, other.order) && Objects.equals(poduct, other.poduct);
	}

}
