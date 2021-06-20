package testproject;

public class Interviewer {
    public static void main(String[] args) {
        Interviewer interviewer = new Interviewer();
        interviewer.CheckJobSeeker();
    }

    public void CheckJobSeeker() {

        JobSeeker jobSeeker = new JobSeeker();
        if (jobSeeker.interViewGiven().equals("yes")) {
            System.out.println("Enter your interview percentage");
            JobSeeker jobseeker = new JobSeeker();
            int score = jobseeker.percentAge();
            if (score >= 80) {
                System.out.println("your'e Hired");
            } else {
                System.out.println("We will call you back");//interview percetage:
            }
        } else {
            jobSeeker.giveInterview();

        }
    }
}






