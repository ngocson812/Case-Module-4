package com.example.casemd4.repository;

import com.example.casemd4.model.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;



public interface CommentRepo extends PagingAndSortingRepository<Comment, Integer> {
}
