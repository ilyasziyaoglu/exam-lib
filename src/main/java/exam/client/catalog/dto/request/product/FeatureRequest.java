package exam.client.catalog.dto.request.product;

import exam.client.common.dto.request.AbstractRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class FeatureRequest extends AbstractRequest {

	private String key;

	private String name;
}
