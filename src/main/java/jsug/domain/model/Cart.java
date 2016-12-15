package jsug.domain.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cart implements Serializable {
    private final OrderLines orderLines;

    public Cart() {
        this(new OrderLines());
    }

    public Cart(OrderLines orderLines2) {
		// TODO 自動生成されたコンストラクター・スタブ
    	this.orderLines = orderLines2;
	}

	public Cart add(OrderLine orderLine) {
        // 対象の商品が既に買い物カゴに入っているか確認
        Optional<OrderLine> opt = orderLines.stream().filter(x ->
                Objects.equals(x.getGoods().getGoodsId(), orderLine.getGoods().getGoodsId()))
                .findFirst();
        if (opt.isPresent()) {
            // 入っていたら数量を増やす
            OrderLine line = opt.get();
            line.setQuantity(line.getQuantity() + orderLine.getQuantity());
        } else {
            orderLines.list.add(orderLine);
        }
        return this;
    }

    public Cart clear() {
        orderLines.list.clear();
        return this;
    }

    public Cart remove(Set<Integer> lineNo) {
        Iterator<OrderLine> iterator = getOrderLines().getList().iterator();
        for (int i = 0; iterator.hasNext(); i++) {
            iterator.next();
            if (lineNo.contains(i)) {
                iterator.remove();
            }
        }
        return this;
    }

    private OrderLines getOrderLines() {
		// TODO 自動生成されたメソッド・スタブ
		return this.orderLines;
	}

	public boolean isEmpty() {
        return orderLines.list.isEmpty();
    }
}
