package com.example.WeeklyTest8102023.repo;

import com.example.WeeklyTest8102023.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,String> {
}
