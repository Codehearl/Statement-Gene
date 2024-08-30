package com.leadway_pensure.statement_generator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.leadway_pensure.wsdl.GetStatementResponse;

@Controller
public class StatementController {
    @Autowired
    private StatementService statementService;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("statementForm", new StatementForm());
        return "form";
    }

    @PostMapping("/submitForm" )
    public String submitForm(@ModelAttribute StatementForm statementForm, Model model) {
             GetStatementResponse response = statementService.getStatement(statementForm);
        System.out.println(response.getGetStatementResult());
       System.out.println(statementForm.getStartDate());
        model.addAttribute("statement", statementForm);
        return "result";
    }
}