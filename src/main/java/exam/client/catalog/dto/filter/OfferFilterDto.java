package exam.client.catalog.dto.filter;

import exam.client.offer.enumeration.OfferStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
public class OfferFilterDto {

	private ZonedDateTime startDate;

	private ZonedDateTime endDate;

	private String productNumber;

	private OfferStatus currentStatus;

	private OfferStatus currentStatusNot;

	private String fromCompany;

	private String toCompany;

}

