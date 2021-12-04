package com.heyalien.ytclonebackend.repository;

import com.heyalien.ytclonebackend.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends MongoRepository<Video, String> {

}
