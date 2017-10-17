package com.iceihehe.easynote.repository;

import com.iceihehe.easynote.domain.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, ObjectId>, UserRepoCustom {

}
