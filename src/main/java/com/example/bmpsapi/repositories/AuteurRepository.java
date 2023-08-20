package com.example.bmpsapi.repositories;

import com.example.bmpsapi.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository extends JpaRepository <Account, Long> {

}
