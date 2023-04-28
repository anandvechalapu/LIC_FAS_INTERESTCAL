@Repository
public interface SaveLookUpTypeValueLookupControllerRepository extends JpaRepository<LookupType, Long> {
    
    @Query("SELECT lt FROM LookupType lt WHERE lt.id = :id")
    LookupType getLookupTypeById(@Param("id") Long id);
    
    @Modifying
    @Query("UPDATE LookupType lt SET lt.code = :code, lt.name = :name, lt.createdBy = :createdBy, lt.modifiedBy = :modifiedBy WHERE lt.id = :id")
    void updateLookupType(@Param("id") Long id, @Param("code") String code, @Param("name") String name, @Param("createdBy") Long createdBy, @Param("modifiedBy") Long modifiedBy);
    
    @Query("SELECT lv FROM LookupValue lv WHERE lv.lookupType.id = :lookupTypeId")
    List<LookupValue> getLookupValuesByLookupTypeId(@Param("lookupTypeId") Long lookupTypeId);
    
    @Modifying
    @Query("UPDATE LookupValue lv SET lv.code = :code, lv.value = :value, lv.orderNo = :orderNo, lv.createdBy = :createdBy, lv.modifiedBy = :modifiedBy WHERE lv.id = :id")
    void updateLookupValue(@Param("id") Long id, @Param("code") String code, @Param("value") String value, @Param("orderNo") Integer orderNo, @Param("createdBy") Long createdBy, @Param("modifiedBy") Long modifiedBy);
    
    @Modifying
    @Query("DELETE FROM LookupValue lv WHERE lv.lookupType.id = :lookupTypeId")
    void deleteLookupValueByLookupTypeId(@Param("lookupTypeId") Long lookupTypeId);
}