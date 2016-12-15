package jsug.domain.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderLines implements Serializable {
    final List<OrderLine> list;

    public OrderLines() {
        this(new ArrayList<>());
    }

    public OrderLines(ArrayList arrayList) {
		// TODO 自動生成されたコンストラクター・スタブ
    	this.list = arrayList;
	}

	public OrderLines orderId(UUID orderId) {
        int i = 0;
        for (OrderLine orderLine : list) {
            orderLine.setLineNo(++i);
            orderLine.setOrderId(orderId);
        }
        return this;
    }

    public Stream<OrderLine> stream() {
        return list.stream();
    }

    public long getTotal() {
        return list.stream()
                .mapToLong(OrderLine::getSubtotal)
                .sum();
    }

	public List<OrderLine> getList() {
		return list;
	}

}
