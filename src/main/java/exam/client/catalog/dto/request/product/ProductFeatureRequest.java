package exam.client.catalog.dto.request.product;

import exam.client.common.dto.request.AbstractRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProductFeatureRequest extends AbstractRequest {

	private FeatureRequest feature;

	private String value;
}
