package exam.client.catalog.dto.response.product;

import exam.client.catalog.dto.response.company.CompanyResponse;
import exam.client.common.dto.response.AbstractResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DistributorResponse extends AbstractResponse {

    private CompanyResponse company;

    private Integer stock;

    private Double unitPrice;

    private Long productId;

}
