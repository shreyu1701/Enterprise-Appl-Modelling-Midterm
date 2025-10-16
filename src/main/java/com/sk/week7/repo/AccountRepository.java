package com.sk.week7.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.sk.week7.model.Account;

@Repository
public interface AccountRepository extends  ReactiveMongoRepository<Account, String>{ 
 
}

