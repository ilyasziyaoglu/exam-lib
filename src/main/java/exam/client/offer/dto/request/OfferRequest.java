package exam.client.offer.dto.request;

import exam.client.catalog.dto.request.company.CompanyRequest;
import exam.client.common.dto.request.AbstractRequest;
import exam.client.offer.enumeration.OfferStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
public class OfferRequest extends AbstractRequest {

	private Long grupId;

	private BigDecimal amount;

	private Double unitPrice;

	private OfferStatus currentStatus;

	private Long productId;

	private Long userId;

	private CompanyRequest fromCompany;

	private CompanyRequest toCompany;

	private Set<OfferHistoryRequest> offerHistory;
}
