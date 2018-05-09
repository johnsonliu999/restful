package fun.glyn.restful.api.v1.model;

import lombok.Data;

@Data
public class CustomerDTO {
    private long id;
    private String firstname;
    private String lastname;
    private String url;
}
