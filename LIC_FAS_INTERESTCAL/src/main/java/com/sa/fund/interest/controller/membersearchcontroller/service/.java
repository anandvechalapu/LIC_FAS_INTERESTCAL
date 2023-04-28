package com.sa.fund.interest.controller.membersearchcontroller.service;

import com.sa.fund.interest.controller.membersearchcontroller.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewMembersByPolicyNoMemberSearchControllerService {

    List<Member> findByPolicyNumber(String policyNumber);
}