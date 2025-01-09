package com.oliveira.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式-报表-结构对象角色
 */
public class BusinessReport {

    private List<Employee> employeeList = new ArrayList<>();

    public BusinessReport() {
        employeeList.add(new Manager("经理-A"));
        employeeList.add(new Engineer("工程师-A"));
        employeeList.add(new Engineer("工程师-B"));
        employeeList.add(new Engineer("工程师-C"));
        employeeList.add(new Manager("经理-B"));
        employeeList.add(new Manager("经理-C"));
    }

    /**
     * 为访问者展示报表
     *
     * @param visitor
     */
    public void showReport(Visitor visitor) {
        for (Employee employee : employeeList) {
            employee.accept(visitor);
        }
    }
}
