package com.fabian_chuqui.m5a_api_rest_full.Repository;

import com.fabian_chuqui.m5a_api_rest_full.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
