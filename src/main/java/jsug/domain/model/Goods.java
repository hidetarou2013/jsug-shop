package jsug.domain.model;

import java.io.Serializable;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Goods implements Serializable {
    private UUID goodsId;
    private String goodsName;
    private String description;
    private Category category;
    private int price;
	public int getPrice() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	public UUID getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(UUID goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
