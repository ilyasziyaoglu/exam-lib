package exam.client.catalog.dto.response.product;

import exam.client.common.dto.response.AbstractResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
public class SimpleProductResponse  extends AbstractResponse {

    private String productNumber;

    private String name;

    private String description;

    private Long categoryId;

    private String categoryName;

    private String producer;


    private Set<DistributorResponse> distributors;

    public int getTotalStock(){
        int stock = 0;
        for (DistributorResponse distributor : distributors) {
            stock+=distributor.getStock();
        }
        return stock;
    }

}
