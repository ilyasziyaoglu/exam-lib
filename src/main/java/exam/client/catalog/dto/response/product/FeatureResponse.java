package exam.client.catalog.dto.response.product;

import exam.client.common.dto.response.AbstractResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class FeatureResponse extends AbstractResponse {
    private String key;

    private String name;

}
