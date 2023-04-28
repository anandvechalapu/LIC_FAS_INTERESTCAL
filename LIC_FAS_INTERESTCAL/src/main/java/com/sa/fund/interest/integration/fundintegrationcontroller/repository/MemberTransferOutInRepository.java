package com.sa.fund.interest.integration.fundintegrationcontroller.repository;import org.springframework.data.jpa.repository.JpaRepository;import com.sa.fund.interest.integration.fundintegrationcontroller.model.MemberTransferOutIn;public interface MemberTransferOutInRepository extends JpaRepository<MemberTransferOutIn, Long> { 
    // Custom repository methods can be added here
}