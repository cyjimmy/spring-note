package com.cyjimmy.springnote.controller;

import com.cyjimmy.springnote.model.Note;
import com.cyjimmy.springnote.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/getAllNote")
    public List<Note> getAllNote() {
        return noteService.getAllNotes();
    }

    @PostMapping("/addNote")
    public String addNote(@RequestBody Note note) {
        noteService.addNote(note);
        return "New note added.";
    }
}
