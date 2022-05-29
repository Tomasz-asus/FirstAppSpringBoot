package com.example.FirstAppSpringBoot.SectionA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource
interface TopicRepository extends JpaRepository<Topic, Integer> {
}
