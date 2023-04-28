@Repository
public interface MemberSearchControllerRepository extends JpaRepository<Member, Long> {
 
    CommonResponseDto<Object> searchByMember(String code);
}