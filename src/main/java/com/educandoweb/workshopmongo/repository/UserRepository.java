package com.educandoweb.workshopmongo.repository;

import com.educandoweb.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.educandoweb.workshopmongo.domain.User;

import java.util.Date;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    @Query("{ $and: [ { name: { $eq: ?1 } }, { status: { $eq: ?0 } } ] }")
    List<User> findByStatusName(Integer status, String name);
}