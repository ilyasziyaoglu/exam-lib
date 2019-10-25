package exam.client.catalog.dto.request.company;

import exam.client.common.dto.request.AbstractRequest;
import exam.client.common.enumeration.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CompanyRequest extends AbstractRequest {

	private Status status;

	private String name;



}
