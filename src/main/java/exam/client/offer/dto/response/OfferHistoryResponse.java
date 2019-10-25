package exam.client.offer.dto.response;

import exam.client.common.dto.response.AbstractResponse;
import exam.client.offer.enumeration.OfferStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
public class OfferHistoryResponse extends AbstractResponse {

	private OfferStatus status;

	private String description;

	private ZonedDateTime date;
}
