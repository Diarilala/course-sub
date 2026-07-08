package com.agito.choom.repository;

import com.agito.choom.repository.model.JCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SourceRepository extends JpaRepository<JCourse, UUID> {
}
