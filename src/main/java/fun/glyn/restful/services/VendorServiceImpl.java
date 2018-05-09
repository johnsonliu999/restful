package fun.glyn.restful.services;

import fun.glyn.restful.api.v1.mapper.VendorMapper;
import fun.glyn.restful.api.v1.model.VendorDTO;
import fun.glyn.restful.domain.Vendor;
import fun.glyn.restful.repositories.VendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VendorServiceImpl implements VendorService {
    private final VendorMapper vendorMapper;
    private final VendorRepository vendorRepository;

    public VendorServiceImpl(VendorMapper vendorMapper, VendorRepository vendorRepository) {
        this.vendorMapper = vendorMapper;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public List<VendorDTO> getAllVendors() {
        return vendorRepository.findAll().stream()
                .map(vendorMapper::vendorToVendorDTO)
                .collect(Collectors.toList());
    }

    @Override
    public VendorDTO getVendorById(long id) {
        return vendorRepository.findById(id)
                .map(vendorMapper::vendorToVendorDTO)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public VendorDTO createVendor(VendorDTO vendorDTO) {
        Vendor saved = vendorRepository.save(vendorMapper.vendorDTOTOVendor(vendorDTO));
        return vendorMapper.vendorToVendorDTO(saved);
    }

    @Override
    public VendorDTO saveVendor(Long id, VendorDTO vendorDTO) {
        Vendor vendor = vendorMapper.vendorDTOTOVendor(vendorDTO);
        vendor.setId(id);
        return vendorMapper.vendorToVendorDTO(vendorRepository.save(vendor));
    }

    @Override
    public VendorDTO patchVendor(Long id, VendorDTO vendorDTO) {
        return vendorRepository.findById(id).map(vendor -> {
            if (vendorDTO.getName() != null) vendor.setName(vendorDTO.getName());

            return vendorMapper.vendorToVendorDTO(vendorRepository.save(vendor));
        }).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public void deleteVendor(Long id) {
        vendorRepository.deleteById(id);
    }
}
