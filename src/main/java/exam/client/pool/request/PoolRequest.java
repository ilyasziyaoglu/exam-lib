package exam.client.pool.request;

import exam.client.common.dto.request.AbstractRequest;
import exam.client.users.request.UsersRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PoolRequest extends AbstractRequest {

	private String poolName;

	private UsersRequest usersRequest;
}
