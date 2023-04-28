@Repository
public interface MstPageLookUpValueRepository extends JpaRepository<MstPageLookUpValue, Long> {
 
    Optional<MstPageLookUpValue> findByCodeAndIsActiveTrue(String code);

}