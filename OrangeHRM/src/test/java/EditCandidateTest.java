import org.testng.annotations.Test;

public class EditCandidateTest extends baseTest{

    @Test
    public void editCandidateDetails() {
        new Login(driver)
                .performLogin("Admin", "admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterDetails("Pranisha", "P",
                        "Shahapure", "shah@gmail.com").searchCandidate("Pranisha P Shahapure")
                .clickEyeButton().editCandidate();
    }



}
