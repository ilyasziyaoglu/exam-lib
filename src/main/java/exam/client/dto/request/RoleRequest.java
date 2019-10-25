package exam.client.dto.request;

import exam.client.common.dto.request.AbstractRequest;
import exam.client.common.enumeration.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
public class RoleRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	private Status status;

	private String name;

	private Set<PermissionRequest> permissions = new HashSet<>();

}
