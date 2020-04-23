package com.bitacademy.datadust.repositroy;

import com.bitacademy.datadust.ssg.model.SeachItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchItemRepository  extends JpaRepository<SeachItemEntity,Long> {


}
