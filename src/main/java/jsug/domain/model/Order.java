package jsug.domain.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order implements Serializable {
    private UUID orderId;
    private String email;
    private OrderLines orderLines;
    private LocalDate orderDate;
	public UUID getOrderId() {
		return orderId;
	}
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public OrderLines getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(OrderLines orderLines) {
		this.orderLines = orderLines;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

}
