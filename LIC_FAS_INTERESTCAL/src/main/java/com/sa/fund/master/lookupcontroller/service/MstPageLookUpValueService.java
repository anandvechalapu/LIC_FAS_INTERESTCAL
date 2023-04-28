package com.sa.fund.master.lookupcontroller.service;

import com.sa.fund.master.lookupcontroller.model.MstPageLookUpValue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MstPageLookUpValueRepository extends JpaRepository<MstPageLookUpValue, Long> {
 
    Optional<MstPageLookUpValue> findByCodeAndIsActiveTrue(String code);

}

@Service
public class MstPageLookUpValueService {

    private final MstPageLookUpValueRepository mstPageLookUpValueRepository;

    @Autowired
    public MstPageLookUpValueService(MstPageLookUpValueRepository mstPageLookUpValueRepository) {
        this.mstPageLookUpValueRepository = mstPageLookUpValueRepository;
    }

    public Optional<MstPageLookUpValue> findByCodeAndIsActiveTrue(String code) {
        return mstPageLookUpValueRepository.findByCodeAndIsActiveTrue(code);
    }

}