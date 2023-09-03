package base;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests{
    @Test
    public void testSelectedOption(){
        var dropdownPage=homePage.clickDropDown();
        dropdownPage.selectFromDropDown("Option 1");
        var selectedOptions= dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect number of Selections");
        assertTrue(selectedOptions.contains("Option 1"),"Option not selected");

    }
}
