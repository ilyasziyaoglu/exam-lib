package exam.client.questions.response;

import exam.client.common.dto.response.AbstractResponse;
import exam.client.exam_question_rel.response.ExamQuestionResponse;
import exam.client.options.response.OptionsResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class QuestionsResponse extends AbstractResponse {

    private String body;

    private String imageUrl;

    private String subject;

    private List<OptionsResponse> options;
}