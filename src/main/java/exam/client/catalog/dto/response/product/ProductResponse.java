package exam.client.catalog.dto.response.product;

import exam.client.catalog.dto.response.company.CompanyResponse;
import exam.client.common.dto.response.AbstractResponse;
import exam.client.common.enumeration.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProductResponse extends AbstractResponse {

    private String name;

    private String description;

    private Status status;

    private String productNumber;

    private String producer;

    private String productId;

    private Long categoryId;

    private String productType;

    private String productTypeDesc;

    private String note;

    private CompanyResponse owner;

    private Boolean manualCreated;

    private Set<DistributorResponse> distributors = new HashSet<>();

    private Set<ProductFeatureResponse> productFeatures;

    private Set<Long> relatedProducts = new HashSet<>();

    private Set<Long> similarProducts = new HashSet<>();

    private Set<String> images = new HashSet<>();

    public int getTotalStock(){
        int stock = 0;
        for (DistributorResponse distributor : distributors) {
            stock+=distributor.getStock();
        }
        return stock;
    }

}
