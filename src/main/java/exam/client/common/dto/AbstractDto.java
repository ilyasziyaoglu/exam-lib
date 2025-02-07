package exam.client.common.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AbstractDto implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Long id;

	protected String createdBy;

	protected String lastModifiedBy;

}
