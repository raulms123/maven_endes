package com.prueba.endes;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para representar a un empleado.
 */
class Employees {
    private String name;
    private int yearsInCompany;

    /**
     * Constructor de la clase Employee.
     *
     * @param name           Nombre del empleado.
     * @param yearsInCompany Años en la empresa.
     */
    public Employees(String name, int yearsInCompany) {
        this.name = name;
        this.yearsInCompany = yearsInCompany;
    }

    /**
     * Método para obtener el nombre del empleado.
     *
     * @return El nombre del empleado.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para establecer el nombre del empleado.
     *
     * @param name El nuevo nombre del empleado.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para obtener los años en la empresa del empleado.
     *
     * @return Los años en la empresa del empleado.
     */
    public int getYearsInCompany() {
        return yearsInCompany;
    }

    /**
     * Método para establecer los años en la empresa del empleado.
     *
     * @param yearsInCompany Los nuevos años en la empresa del empleado.
     */
    public void setYearsInCompany(int yearsInCompany) {
        this.yearsInCompany = yearsInCompany;
    }
}
