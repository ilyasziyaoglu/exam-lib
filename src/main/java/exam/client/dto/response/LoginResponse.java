package exam.client.dto.response;

import exam.client.common.dto.response.AbstractResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class LoginResponse extends AbstractResponse {

	private static final long serialVersionUID = 4153928203761472807L;

	private String token;

	private UserResponse userData;

}
