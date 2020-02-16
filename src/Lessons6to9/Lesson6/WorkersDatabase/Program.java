package Lessons6to9.Lesson6.WorkersDatabase;


public class Program {
    public static void main(String[] args) {
        //inicjuję obiekt menu
        Menu menu = new Menu();
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();

        int action = -1;
        //wychodzimy z pętli dopiero jak jest false, czyli jak ktoś wpisze 0 to jest true a  my to negujemy na false
        while (!(action == 0)) {
            menu.showMenu();
            action = menu.takeUserAction();

            switch (action) {

                case 1: /*wyświetl wszystkich użytkowników */
                    employeeDatabase.showEmployee();
                    break;

                case 2: /*dodaj pracownika*/
                    employeeDatabase.addEmployee();
                    break;
                case 4: /*usun pracownika*/
                    employeeDatabase.showEmployee();
                    employeeDatabase.deleteEmployeeFilip();
                    break;
                default:
                    System.out.println("Brak takiej pozycji w menu");
            }
        }
    }
}

