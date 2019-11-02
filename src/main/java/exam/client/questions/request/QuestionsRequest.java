package exam.client.questions.request;

import exam.client.common.dto.request.AbstractRequest;
import exam.client.exam_question_rel.request.ExamQuestionRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class QuestionsRequest extends AbstractRequest {

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


	private List<ExamQuestionRequest> examQuestions;
}
