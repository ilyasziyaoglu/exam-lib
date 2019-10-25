package exam.client.offer.dto.response;

import exam.client.catalog.dto.response.company.CompanyResponse;
import exam.client.catalog.dto.response.product.DistributorResponse;
import exam.client.common.dto.response.AbstractResponse;
import exam.client.offer.enumeration.OfferStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
public class OfferResponse extends AbstractResponse {

	private Long grupId;

	private BigDecimal amount;

	private Double unitPrice;

	private OfferStatus currentStatus;

	private Long offerProductId;

	private Long userId;

	private CompanyResponse fromCompany;

	private CompanyResponse toCompany;

	private Set<OfferHistoryResponse> offerHistory;

	private String productNumber;

	private String productName;

	private String userName;

	private ZonedDateTime createdDate;

	private Set<DistributorResponse> distributors;
}