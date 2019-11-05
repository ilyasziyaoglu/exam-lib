package exam.client.pool.response;

import exam.client.common.dto.response.AbstractResponse;
import exam.client.users.response.UsersResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PoolResponse extends AbstractResponse {

    private String poolName;

    private UsersResponse usersResponse;
}