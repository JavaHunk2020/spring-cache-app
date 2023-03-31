package com.rabbit.samples.springrediscache.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rabbit.samples.springrediscache.domain.Post;


/**
 * @author Matteo Baiguini
 * matteo@solidarchitectures.com
 * 06 Feb 2019
 */
@Repository
public interface PostRepo extends JpaRepository<Post, Long> {

	// no-op
}
