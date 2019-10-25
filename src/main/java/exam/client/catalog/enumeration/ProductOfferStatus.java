package exam.client.catalog.enumeration;

import exam.client.common.enumeration.AbstractEnum;

public enum ProductOfferStatus implements AbstractEnum {

	OPEN(0), CLOSED(1);

	private ProductOfferStatus(int id) {
		this.id = id;
	}

	private int id;

	@Override
	public int getId() {
		return id;
	}

}
