package com.droidablebee.springboot.rest.controller;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


@RequestScope
@Component
@Data
public class JSONRequest {

    private String firstNumber;
    private String secondNumber;

    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
    }



    @Autowired
    JSONResponse ans;

    public String calc(String first,String second){

        ans.setAnswer(first+second);
        ans.setStatus("done");
        return ans.getAnswer();
    }
    public String calc2(String first,String second){

        ans.setAnswer(first+second);
        return ans.getAnswer();
    }
}
