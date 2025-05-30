import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class VotingSystemApp {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        Scanner scanner = new Scanner(System.in);

        // ������������� �������� ������
        system.registerUser("user1", "pass1", "������ ���� ��������", LocalDate.of(1990, 1, 1), "123-456-789 00");
        system.createCEC("cec1", "cecpass1");

        boolean running = true;
        while (running) {
            System.out.println("1. ����");
            System.out.println("2. �����������");
            System.out.println("0. �����");
            System.out.print("�������� ��������: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("�����: ");
                    String username = scanner.nextLine();
                    System.out.print("������: ");
                    String password = scanner.nextLine();

                    if (system.login(username, password)) {
                        showUserMenu(system, scanner);
                    } else {
                        System.out.println("�������� ����� ��� ������");
                    }
                    break;
                case 2:
                    System.out.print("���: ");
                    String fullName = scanner.nextLine();
                    System.out.print("���� �������� (����-��-��): ");
                    LocalDate birthDate = LocalDate.parse(scanner.nextLine());
                    System.out.print("�����: ");
                    String snils = scanner.nextLine();
                    System.out.print("�����: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("������: ");
                    String newPassword = scanner.nextLine();

                    system.registerUser(newUsername, newPassword, fullName, birthDate, snils);
                    System.out.println("����������� �������");
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("�������� �����");
            }
        }
    }

    private static void showUserMenu(VotingSystem system, Scanner scanner) {
        String role = system.getCurrentUser().getRole();

        switch (role) {
            case "ADMIN":
                showAdminMenu(system, scanner);
                break;
            case "CEC":
                showCECMenu(system, scanner);
                break;
            case "CANDIDATE":
                showCandidateMenu(system, scanner);
                break;
            case "USER":
                showUserRegularMenu(system, scanner);
                break;
            default:
                System.out.println("����������� ����");
        }
    }

    private static void showAdminMenu(VotingSystem system, Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("\n���� ��������������:");
            System.out.println("1. �������� �������������");
            System.out.println("2. �������� ������������");
            System.out.println("3. �������� ���");
            System.out.println("4. �������� ����������");
            System.out.println("5. �������� ���������");
            System.out.println("0. �����");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("\n������ �������������:");
                    system.getAllUsers().forEach(u -> System.out.println(u.getUsername() + " - " + u.getRole()));
                    break;
                case 2:
                    System.out.print("������� ����� ������������ ��� ��������: ");
                    String usernameToDelete = scanner.nextLine();
                    system.deleteUser(usernameToDelete);
                    System.out.println("������������ ������");
                    break;
                case 3:
                    System.out.print("������� ����� ���: ");
                    String cecUsername = scanner.nextLine();
                    System.out.print("������� ������ ���: ");
                    String cecPassword = scanner.nextLine();
                    system.createCEC(cecUsername, cecPassword);
                    System.out.println("��� ������");
                    break;
                case 4:
                    System.out.println("\n������ ����������:");
                    system.getAllCandidates().forEach(c -> System.out.println(c.getUsername() + " - " + c.getFullName()));
                    break;
                case 5:
                    System.out.print("������� ����� ��������� ��� ��������: ");
                    String candidateToDelete = scanner.nextLine();
                    system.deleteCandidate(candidateToDelete);
                    System.out.println("�������� ������");
                    break;
                case 0:
                    back = true;
                    system.logout();
                    break;
                default:
                    System.out.println("�������� �����");
            }
        }
    }

    // ����������� ������ ��� ������ ����� (showCECMenu, showCandidateMenu, showUserRegularMenu)
    // ...
}