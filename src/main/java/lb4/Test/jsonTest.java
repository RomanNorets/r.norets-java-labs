package lb4.Test;

import lb4.controller.UniversityCreator;
import lb4.model.University;
import lb4.JsonManager;

import org.junit.Assert;
import org.junit.Test;


public class jsonTest {
    @Test
    public void testFileWriteJsonToFile() {

        String filePath = "./src/main/java/lb4/myJSON.json";
        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity();

        jsonManager.writeToJson(oldUniversity, filePath);
        University newUniversity = (University) jsonManager.readFromJson(filePath);

        Assert.assertEquals(newUniversity, oldUniversity);
    }
 }

