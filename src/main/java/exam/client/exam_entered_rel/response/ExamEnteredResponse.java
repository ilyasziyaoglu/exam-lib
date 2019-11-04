package exam.client.exam_entered_rel.response;

import exam.client.common.dto.response.AbstractResponse;
import exam.client.exam.dto.request.ExamRequest;
import exam.client.options.response.OptionsResponse;
import exam.client.questions.response.QuestionsResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;

@Data
@EqualsAndHashCode(callSuper = false)
public class ExamEnteredResponse extends AbstractResponse {

	private float examScore;

	private boolean isEntered;

	private int examDuration;

	private ExamRequest exam;

	private HashMap<QuestionsResponse, OptionsResponse> userAnswers;
}