package exam.client.catalog.dto.request.category;

import exam.client.common.dto.request.AbstractRequest;
import exam.client.common.enumeration.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
public class CategoryRequest extends AbstractRequest {

	private Status status;

	private String name;

	private String description;

	private Long parentId;

	private Integer level;

	private Set<CategoryRequest> children = new HashSet<CategoryRequest>();

}
