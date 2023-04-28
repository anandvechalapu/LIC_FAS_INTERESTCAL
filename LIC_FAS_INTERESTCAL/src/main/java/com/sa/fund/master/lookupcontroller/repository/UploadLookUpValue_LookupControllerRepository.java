import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadLookUpValue_LookupControllerRepository extends JpaRepository<LookupType, Long> {

    LookupType findByLookupTypeId(Long lookupTypeId);

    List<LookupValue> findByLookupTypeId(Long lookupTypeId);

    void saveAllLookupValues(List<LookupValue> lookupValues);

    void saveLookupType(LookupType lookupType);

    void deleteLookupValuesByLookupTypeId(Long lookupTypeId);
}