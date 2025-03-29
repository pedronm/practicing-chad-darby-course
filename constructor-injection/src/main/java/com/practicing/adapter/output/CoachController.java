package com.practicing.adapter.output;

@RestController
public class CoachController{

    @GetController
    public String getDailyWorkout(String coach){
        return "Testing out";
    }
}