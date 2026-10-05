import java.util.*;

class Patient {
    int id;
    String name;
    int age;

    Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(id + "  " + name + "  " + age);
    }
}

public class HospitalManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n--- HOSPITAL MANAGEMENT ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Book Appointment");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    patients.add(new Patient(id, name, age));
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    System.out.println("\nID  Name  Age");
                    for (Patient p : patients)
                        p.display();
                    break;

                case 3:
                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Doctor Name: ");
                    String doctor = sc.nextLine();

                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();

                    System.out.println("Appointment booked!");
                    System.out.println("Patient ID: " + pid);
                    System.out.println("Doctor: " + doctor);
                    System.out.println("Date: " + date);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}

