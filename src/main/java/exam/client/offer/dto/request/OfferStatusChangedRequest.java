package exam.client.offer.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class OfferStatusChangedRequest {

	private Long offerId;

	private Boolean reject;

	private String description;
}