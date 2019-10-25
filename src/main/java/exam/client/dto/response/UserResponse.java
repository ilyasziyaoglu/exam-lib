package exam.client.dto.response;

import exam.client.catalog.dto.response.company.CompanyResponse;
import exam.client.common.dto.response.AbstractResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserResponse extends AbstractResponse {

	private String username;

	private String email;

	private List<String> permissions =  new ArrayList<>();

	private CompanyResponse company;

}
