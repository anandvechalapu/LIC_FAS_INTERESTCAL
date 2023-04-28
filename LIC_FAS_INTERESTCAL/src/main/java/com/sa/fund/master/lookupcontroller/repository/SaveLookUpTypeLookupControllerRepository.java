@Repository
public interface SaveLookUpTypeLookupControllerRepository extends JpaRepository<LookUpType, Long> {

    LookUpType save(LookUpType lookUpType);

    LookUpType findById(Long id);

    List<LookUpType> findAll();

    LookUpType update(LookUpType lookUpType);

    void deleteById(Long id);

    boolean existsById(Long id);

    LookUpType generateCode(LookUpType lookUpType);

    LookUpType updateLookUpValues(LookUpType lookUpType);
}