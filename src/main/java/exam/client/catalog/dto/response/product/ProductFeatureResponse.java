package exam.client.catalog.dto.response.product;

import exam.client.common.dto.response.AbstractResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProductFeatureResponse extends AbstractResponse {

    private FeatureResponse feature;

    private String value;

}
