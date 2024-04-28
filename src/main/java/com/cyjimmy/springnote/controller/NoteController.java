package com.cyjimmy.springnote.controller;

import com.cyjimmy.springnote.model.Note;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class NoteController {
    @GetMapping("/getAllNote")
    public List<Note> getAllNote() {
        return null;
    }
}
