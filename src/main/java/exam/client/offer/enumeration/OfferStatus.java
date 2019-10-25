package exam.client.offer.enumeration;

import exam.client.common.enumeration.AbstractEnum;

public enum OfferStatus implements AbstractEnum {

	BASKET(-1, "Henüz talep oluşturulmadı"),
	RECEIVED(0, "Talebiniz alındı"),
	REVIEW(1, "Talep Satıcının Değerlendirme Aşamasında"),
	DISTRIBUTOR_CONFIRMED(2, "Talep Satıcı Tarafından Onaylandı"),
	BIDDER_CONFIRMED(3, "Talep Alıcı Tarafından Onaylandı"),
	BILLED(4, "Talebin Faturası Kesildi"),
	COMPLETED(5, "Talep Tamamlandı"),
	CANCELLED(6, "Talep İptal Edildi"),
	REJECTED(7, "Talep Satıcı Tarafından Reddedildi");

	private OfferStatus(int id, String desc) {
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
