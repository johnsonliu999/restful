package fun.glyn.restful.services;


import fun.glyn.restful.api.v1.model.VendorDTO;

import java.util.List;

public interface VendorService {
    List<VendorDTO> getAllVendors();
    VendorDTO getVendorById(long id);
    VendorDTO createVendor(VendorDTO vendorDTO);
    VendorDTO saveVendor(Long id, VendorDTO vendorDTO);
    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);
    void deleteVendor(Long id);
}
