package com.cyjimmy.springnote.repository;

import com.cyjimmy.springnote.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {

}
