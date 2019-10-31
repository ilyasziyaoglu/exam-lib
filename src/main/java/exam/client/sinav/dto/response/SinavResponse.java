package exam.client.sinav.dto.response;

import exam.client.catalog.dto.response.company.CompanyResponse;
import exam.client.common.dto.response.AbstractResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
public class SinavResponse extends AbstractResponse {

	private String name;

	private String description;

	private ZonedDateTime date;

	private CompanyResponse company;

	private int registeredCount;

	private int questionCoun;

	private String type;
}