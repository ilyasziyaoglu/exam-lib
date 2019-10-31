package exam.client.sinav.dto.request;

import exam.client.catalog.dto.request.company.CompanyRequest;
import exam.client.common.dto.request.AbstractRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
public class SinavRequest extends AbstractRequest {

	private String name;

	private String description;

	private ZonedDateTime date;

	private int registeredCount;

	private int questionCoun;

	private String type;
}
