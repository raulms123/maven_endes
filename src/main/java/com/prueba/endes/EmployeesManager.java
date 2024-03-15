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

    /**
     * Método para imprimir la lista de empleados.
     */
    public void printEmployees() {
        System.out.println("List of employees:");
        for (Employees employee : employees) {
            System.out.println(employee.getName() + ", Years in company: " + employee.getYearsInCompany());
        }
    }

    public static void main(String[] args) {
        EmployeesManager manager = new EmployeesManager();
        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);
        manager.printEmployees();
    }
}


