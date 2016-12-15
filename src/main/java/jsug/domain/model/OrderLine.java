package jsug.domain.model;

import java.io.Serializable;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderLine implements Serializable {
    private Goods goods;
    private int quantity;
    private UUID orderId;
    private int lineNo;

    public long getSubtotal() {
        return quantity * goods.getPrice();
    }

	public void setLineNo(int i) {
		// TODO 自動生成されたメソッド・スタブ
		this.lineNo = i;
	}

	public void setOrderId(UUID orderId2) {
		// TODO 自動生成されたメソッド・スタブ
		this.orderId = orderId2;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public UUID getOrderId() {
		return orderId;
	}

	public int getLineNo() {
		return lineNo;
	}

}
