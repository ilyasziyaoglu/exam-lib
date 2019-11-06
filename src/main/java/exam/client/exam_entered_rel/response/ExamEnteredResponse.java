package exam.client.exam_entered_rel.response;

import exam.client.common.dto.response.AbstractResponse;
import exam.client.exam.dto.request.ExamRequest;
import exam.client.options.response.OptionsResponse;
import exam.client.questions.response.QuestionsResponse;
import exam.client.user_answers_rel.response.UsersAnswersResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = false)
public class ExamEnteredResponse extends AbstractResponse {

	private float examScore;

	private boolean isEntered;

	private int examDuration;

	private ExamRequest exam;

	private List<UsersAnswersResponse> userAnswers;
}