package exam.client.catalog.dto.response.company;

import exam.client.common.dto.response.AbstractResponse;
import exam.client.common.enumeration.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CompanyResponse extends AbstractResponse {
    private Status status;

    private String name;

}
