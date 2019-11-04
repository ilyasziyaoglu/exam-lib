package exam.client.exam_entered_rel.request;

import exam.client.common.dto.request.AbstractRequest;
import exam.client.exam.dto.request.ExamRequest;
import exam.client.options.request.OptionsRequest;
import exam.client.questions.request.QuestionsRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;

@Data
@EqualsAndHashCode(callSuper = false)
public class ExamEnteredRequest extends AbstractRequest {

	private float examScore;

	private boolean isEntered;

	private int examDuration;

	private ExamRequest exam;

	private HashMap<QuestionsRequest, OptionsRequest> userAnswers;
}
