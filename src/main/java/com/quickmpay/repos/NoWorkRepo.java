package com.quickmpay.repos;

import com.quickmpay.entities.KycDetails;
import com.quickmpay.entities.NoWork;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoWorkRepo extends JpaRepository<NoWork,Integer> {
}
