package exam.client.catalog.enumeration;

import exam.client.common.enumeration.AbstractEnum;

import java.math.BigDecimal;

public enum StockModel implements AbstractEnum {

	NONE(0, "Stok kullanılmıyor", BigDecimal.ZERO),
	ONLY_CHECK_STOCK(1, "Sadece kontrol için", BigDecimal.ONE),
	CHECK_AND_DECREASE_STOCK(2, "Kontrol ve azaltma", BigDecimal.ONE);

	private StockModel(int id, String description, BigDecimal minStockAmount) {
		this.id = id;
		this.description = description;
		this.minStockAmount = minStockAmount;
	}

	private int id;

	private String description;

	private BigDecimal minStockAmount;

	@Override
	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public BigDecimal getMinStockAmount() {
		return minStockAmount;
	}

}
