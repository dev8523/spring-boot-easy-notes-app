package com.debasish.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debasish.easynotes.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
