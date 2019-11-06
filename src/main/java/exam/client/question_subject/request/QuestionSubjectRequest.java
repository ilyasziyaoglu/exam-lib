package exam.client.question_subject.request;

import exam.client.common.dto.request.AbstractRequest;
import exam.client.questions.request.QuestionsRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class QuestionSubjectRequest extends AbstractRequest {

	private String name;

	private List<QuestionsRequest> questions;
}
