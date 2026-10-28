import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();
        Candidate c = new Candidate(name, percentage, backlogs, graduationYear);
        Job j = new Job("Infosys", "Java Developer", 65.0, 0, 2026);
        boolean percentagePass = c.getPercentage() >= j.getMinimumPercentage();
        boolean backlogPass = c.getBacklogs() <= j.getMaximumBacklogs();
        boolean yearPass = c.getGraduationYear() == j.getRequiredGraduationYear();
        boolean eligible = percentagePass && backlogPass && yearPass;
        System.out.println("================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("================================");
        System.out.println();

        System.out.println("Candidate : " + c.getName());
        System.out.println("Company   : " + j.getCompany());
        System.out.println("Role      : " + j.getRole());
        System.out.println();
        if (percentagePass) {
            System.out.println("Percentage      : PASS");
        } else {
            System.out.println("Percentage      : FAIL");
        }

        if (backlogPass) {
            System.out.println("Backlogs        : PASS");
        } else {
            System.out.println("Backlogs        : FAIL");
        }

        if (yearPass) {
            System.out.println("Graduation Year : PASS");
        } else {
            System.out.println("Graduation Year : FAIL");
        }

        System.out.println();

        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        System.out.println("================================");

        /*
         * System.out.println("Candidate: " + c.getName());
         * System.out.println("Percentage: " + j.getCompany());
         * System.out.println("Role: " + j.getRole());
         * System.out.println("Minimum Percentage: " + j.getMinimumPercentage());
         * System.out.println("Maximum Backlogs: " + j.getMaximumBacklogs());
         * System.out.println("Graduation Year: " + j.getRequiredGraduationYear());
         */

        scanner.close();
    }
}