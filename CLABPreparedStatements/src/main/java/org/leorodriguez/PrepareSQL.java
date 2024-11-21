package org.leorodriguez;

public class PrepareSQL {
    public final static  String GetEmployeeByID ="SELECT * FROM employee WHERE id=?";
    public final static  String GetEmployeeBySalary ="SELECT * FROM employee WHERE salary=?";
    public final static  String GetEmployeeByOfficeNumber = "SELECT * FROM employee WHERE officeNumber=?";
    public final static String UpdateEmployeeExtentsionNumber = "UPDARE Employees SET extentsionNumber=?"+
            "WHERE officeCode =?";
    public static  final String ShowEmpLastNameLessThanFive = "SELECT * FROM employees WHERE" +
            " length(lastName)<?";
    public static String officeCode(){
        return "SELECT * FROM EMPLOYEES WHERE OFFICECODE =1 && 4";
    }
}
