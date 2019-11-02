package exam.client.users.response;

import exam.client.catalog.dto.response.company.CompanyResponse;
import exam.client.common.dto.response.AbstractResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class UsersResponse extends AbstractResponse {

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