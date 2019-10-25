package exam.client.catalog.dto.request.product;

import exam.client.catalog.dto.request.company.CompanyRequest;
import exam.client.common.dto.request.AbstractRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DistributorRequest extends AbstractRequest {

    private CompanyRequest company;

    private Integer stock;

    private Double unitPrice;

}
