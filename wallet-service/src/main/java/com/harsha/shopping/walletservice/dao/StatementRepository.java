package com.harsha.shopping.walletservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.harsha.shopping.walletservice.entity.Statement;

import java.util.List;

@Repository
public interface StatementRepository extends MongoRepository<Statement, String> {

    List<Statement> findByWalletId(int walletId);
}
