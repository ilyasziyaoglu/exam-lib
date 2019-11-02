package exam.client.users.request;

import exam.client.common.dto.request.AbstractRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class UsersRequest extends AbstractRequest {

	private String email;

	private String passwordHash;

	private String username;

	private String fullName;

	private Date birthDate;

	private boolean gender;

	private String imageUrl;

	private float moneyBalance;

	private ZonedDateTime registerDate;

	private boolean isActive;

	private int userType;
}
