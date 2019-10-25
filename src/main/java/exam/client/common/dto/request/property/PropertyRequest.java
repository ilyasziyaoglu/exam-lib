package exam.client.common.dto.request.property;

import exam.client.common.dto.request.AbstractRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PropertyRequest extends AbstractRequest {

	private String key;

	private String value;

	private String description;

}
