package exam.client.catalog.enumeration;

import exam.client.common.enumeration.AbstractEnum;

public enum ProductStatus implements AbstractEnum {

	SOLID(0, "Sağlam"), FIXED(1, "Sağlam Dönen"), DEFECTIVE(2, "Arızalı"), MISSING(3, "Eksikli");

	private ProductStatus(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	private int id;

	private String desc;

	@Override
	public int getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

}
