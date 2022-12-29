package com.cloudtech.crud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cloudtech.crud.entity.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer>{

}
