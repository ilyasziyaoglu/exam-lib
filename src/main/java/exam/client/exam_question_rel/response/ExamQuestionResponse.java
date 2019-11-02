package exam.client.exam_question_rel.response;

import exam.client.common.dto.response.AbstractResponse;
import exam.client.questions.response.QuestionsResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class ExamQuestionResponse extends AbstractResponse {

	private int questionOrder;

	private int point;

	private int optionCount;

	private QuestionsResponse question;
}