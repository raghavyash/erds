package com.raghav.eq.repository;

import com.raghav.eq.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
            CustomerEntity findByEmail(String email);
}
