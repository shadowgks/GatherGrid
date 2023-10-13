package com.example.gathergrid;

import jakarta.persistence.Persistence;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

@WebServlet(value = "/unit", loadOnStartup = 1)
public class InitDB extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("test");
        Persistence.createEntityManagerFactory("my-persistence-unit");
    }
}
