package exam.client.users.response;

import exam.client.catalog.dto.response.company.CompanyResponse;
import exam.client.common.dto.response.AbstractResponse;
import exam.client.exam.dto.request.ExamRequest;
import exam.client.exam_entered_rel.request.ExamEnteredRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class UsersResponse extends AbstractResponse {

	private String userName;

	private String passwordHash;

	private String fullName;

	private String imageUrl;

	private String eMail;

	private int userType;

	private boolean isActive;

	private boolean gender;

	private Date birthDate;

	private float moneyBalance;

	private List<ExamEnteredRequest> examsEntered;

	private List<ExamRequest> examsCreated;
}