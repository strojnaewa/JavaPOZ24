package Lessons6to9.Lesson6.WorkersDatabase;

import java.util.Scanner;

public class EmployeeDatabase {

    private Employee[] employeeDatabase = new Employee[100];
    private int employeeCount = 0;

    private int pobierIndexPracownika() {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj index pracownika do usuniecia");
        int index = Integer.parseInt(scanner.nextLine());
        return index;
    }

    private int howManyEmployees() {
        int sum = 0;
        for (Employee employee : employeeDatabase) {
            if (employee != null) {
                sum++;
            }

        }
        return sum;
    }


    public EmployeeDatabase() {
        Employee ewa = new Employee("Ewa", "Strojna", 'k', 1234, 145, 27, 0, false);
        employeeDatabase[employeeCount++] = ewa;

        Employee bartek = new Employee("Bartosz", "Weryho", 'm', 987, 987, 31, 0, false);
        employeeDatabase[employeeCount++] = bartek;
    }

    public void addEmployee() {
        //Odpytujemy się użytkownika o wszystkie dane
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Surname:");
        String surname = scanner.nextLine();
        System.out.println("Sex (m/f):");
        char sex = scanner.nextLine().charAt(0);
        System.out.println("Department ID:");
        int departmentID = Integer.valueOf(scanner.nextLine());
        System.out.println("Salary:");
        float salary = Float.valueOf(scanner.nextLine());
        System.out.println("Age:");
        int age = Integer.valueOf(scanner.nextLine());
        System.out.println("Kids:");
        int kids = Integer.valueOf(scanner.nextLine());
        System.out.println("Married (true/ false):");
        boolean married = Boolean.parseBoolean(scanner.nextLine());

        Employee newEmployee = new Employee(name, surname, sex, departmentID, salary, age, kids, married);

        //przypisuję tego nowego pracownika do miejsca w tablicy
        employeeDatabase[employeeCount++] = newEmployee;


    }

    public void showEmployee() {

        for (int i = 0; i < employeeDatabase.length; i++) {
            if (employeeDatabase[i] != null) {
                employeeDatabase[i].okrojoneDane(i);
            }

        }
    }
/*      Metoda niepoprawna - pozostawia pracownika, ale z pustymi wartościami - nielogiczne
        public void deleteEmployee () {
            System.out.println("Wybierz numer pracownika do usunięcia");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            Employee empty = new Employee(null, null, '\0', 0, 0, 0, 0,false);
            employeeDatabase[i] = empty;
        }

 */

    public void deleteEmployeeFilip() {

        int howManyEmployees=howManyEmployees();
        if (howManyEmployees>0) {
            int index = pobierIndexPracownika();
            employeeDatabase[index] = null;
            System.out.println("Employee removed");
        } else {
            System.out.println("List of employees is empty- there's noone to remove");
        }

    }
}



/*
    @Override
    public String toString() {
        return "EmployeeDatabase{" +
                "employees=" + Arrays.toString(employeeDatabase) +
                '}';
    }
*/


