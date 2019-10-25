package exam.client.catalog.dto.response.category;

import exam.client.common.dto.response.AbstractResponse;
import exam.client.common.enumeration.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
public class CategoryResponse extends AbstractResponse {
    private Status status;

    private String name;

    private String description;

    private Long parentId;

    private Integer level;

    private Set<CategoryResponse> children = new HashSet<>();

    @JsonIgnore
    public List<Long> getChildsIdList(){
        List<Long> list = new ArrayList<>();

        for (CategoryResponse child : children) {
            list.addAll(child.getChildsIdList());
        }

        return list;
    }
}
