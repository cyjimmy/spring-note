package com.cyjimmy.springnote.service;

import com.cyjimmy.springnote.model.Note;
import com.cyjimmy.springnote.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Note addNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }
}
