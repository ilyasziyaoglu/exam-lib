package exam.client.catalog.dto.filter;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProductFilterDto {

	private String productNumber;

	private String name;

	private String distributors;

	private List<Long> categoryIds;

}

