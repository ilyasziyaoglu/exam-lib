package exam.client.offer.dto.request;

import exam.client.common.dto.request.AbstractRequest;
import exam.client.offer.enumeration.OfferStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
public class OfferHistoryRequest extends AbstractRequest {

	private OfferStatus status;

	private String description;

	private ZonedDateTime date;
}