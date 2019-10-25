package exam.client.catalog.dto.request.product;

import exam.client.common.dto.request.AbstractRequest;
import exam.client.common.enumeration.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProductRequest extends AbstractRequest {

	private String productNumber;

	private String name;

	private String description;

	private Status status;

	private String producer;

	private String productId;

	private String productType;

	private String productTypeDesc;

	private String note;

	private Long categoryId;

	private Set<DistributorRequest> distributors;

	private Set<ProductFeatureRequest> productFeatures;

	private Set<Long> relatedProducts = new HashSet<>();

	private Set<Long> similarProducts = new HashSet<>();

	private Set<String> images = new HashSet<>();

}
