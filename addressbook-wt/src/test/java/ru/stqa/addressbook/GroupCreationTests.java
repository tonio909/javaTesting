package ru.stqa.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Gname", "Gheader", "Gfooter"));
        //deleteGroup();
        returnToGroupPageAndLogout();
    }
}
