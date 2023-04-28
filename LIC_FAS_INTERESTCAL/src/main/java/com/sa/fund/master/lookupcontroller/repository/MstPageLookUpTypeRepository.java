import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.fund.master.lookupcontroller.dto.LookUpValuesDto;
import com.sa.fund.master.lookupcontroller.entity.MstPageLookUpType;

public interface MstPageLookUpTypeRepository extends JpaRepository<MstPageLookUpType, Long> {

//This method is used to retrieve the master lookup value by its ID
    MstPageLookUpType findByIdAndIsActiveTrue(Long id);

//This method is used to map the entity to a LookUpValuesDto object
    LookUpValuesDto mapPageLookUpTypeAndValueEntityToDto(MstPageLookUpType mstPageLookUpType);
}