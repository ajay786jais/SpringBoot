package com.example.day2part2.controller;


import com.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class home {
    @GetMapping("/")
    public ArrayList<StudentModel> getStudent(){
        ArrayList<StudentModel> arr = new ArrayList<>();
        arr.add(new StudentModel(1,"AJAY","ajay@gmail"));
        arr.add(new StudentModel(1,"Aditya raj","adityaraj@gmail"));
        arr.add(new StudentModel(1,"Aditya shukla","aditya@gmail"));
        arr.add(new StudentModel(1,"Abhisek ","abhisek@gmail"));
        arr.add(new StudentModel(1,"Agrim","agrim@gmail"));
        return arr;
    }
}
