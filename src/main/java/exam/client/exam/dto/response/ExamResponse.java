package exam.client.exam.dto.response;

import exam.client.catalog.dto.response.company.CompanyResponse;
import exam.client.common.dto.response.AbstractResponse;
import exam.client.exam_question_rel.response.ExamQuestionResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class ExamResponse extends AbstractResponse {

    private String name;

    private String description;

    private ZonedDateTime date;

    private CompanyResponse company;

    private int registeredCount;

    private int questionCoun;

    private String type;


    private List<ExamQuestionResponse> examQuestions;
}