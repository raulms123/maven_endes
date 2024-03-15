package com.prueba.endes;

import java.util.ArrayList;
import java.util.List;

public class EmployeesManager {
    private List<Employees> employees = new ArrayList<>();

    /**
     * Método para añadir un empleado.
     *
     * @param name Nombre del empleado.
     * @param years Años en la empresa.
     */
    public void addEmployee(String name, int years) {
        Employees employee = new Employees(name, years);
        employees.add(employee);
        System.out.println(name + " added to the system.");
    }

    
}


