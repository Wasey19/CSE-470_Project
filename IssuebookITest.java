
package LibraryManagementSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class IssuebookITest {
    
    public IssuebookITest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Issuebook.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Issuebook.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getbookId method, of class Issuebook.
     */
    @Test
    public void testGetbookId() {
        System.out.println("getbookId");
        int bookID = 0;
        Issuebook instance = new Issuebook();
        int expResult = 0;
        int result = instance.getbookId(bookID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getstudentId method, of class Issuebook.
     */
    @Test
    public void testGetstudentId() {
        System.out.println("getstudentId");
        int studentID = 0;
        Issuebook instance = new Issuebook();
        int expResult = 0;
        int result = instance.getstudentId(studentID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getissueDate method, of class Issuebook.
     */
    @Test
    public void testGetissueDate() {
        System.out.println("getissueDate");
        int issueDate = 0;
        Issuebook instance = new Issuebook();
        int expResult = 0;
        int result = instance.getissueDate(issueDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getdueDate method, of class Issuebook.
     */
    @Test
    public void testGetdueDate() {
        System.out.println("getdueDate");
        int dueDate = 0;
        Issuebook instance = new Issuebook();
        int expResult = 0;
        int result = instance.getdueDate(dueDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
