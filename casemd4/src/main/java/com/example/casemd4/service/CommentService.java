package com.example.casemd4.service;

import com.example.casemd4.model.Comment;
import com.example.casemd4.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService {

    @Autowired
    CommentRepo commentRepo;

    @Override
    public List<Comment> findAll() {
        return (List<Comment>) commentRepo.findAll();
    }
}
