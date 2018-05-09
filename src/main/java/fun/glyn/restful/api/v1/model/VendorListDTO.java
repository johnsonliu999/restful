package fun.glyn.restful.api.v1.model;

import fun.glyn.restful.domain.Vendor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class VendorListDTO {
    private List<VendorDTO> vendors;
}
