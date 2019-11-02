package exam.client.exam_question_rel.request;

import exam.client.common.dto.request.AbstractRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class ExamQuestionRequest extends AbstractRequest {

	private int questionOrder;

	private int point;

	private int optionCount;
}
