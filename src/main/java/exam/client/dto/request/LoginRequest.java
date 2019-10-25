package exam.client.dto.request;

import exam.client.common.dto.request.AbstractRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class LoginRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	private String username;

	private String password;

}
