package exam.client.dto.request;

import exam.client.common.dto.request.AbstractRequest;
import exam.client.common.enumeration.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PermissionRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	private String name;

	private String description;

	private Status status;

}
