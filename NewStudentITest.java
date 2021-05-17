
package LibraryManagementSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NewStudentITest {
    
    public NewStudentITest() {
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
     * Test of main method, of class NewStudent.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewStudent.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getstudentId method, of class NewStudent.
     */
    @Test
    public void testGetstudentId() {
        System.out.println("getstudentId");
        int studentID = 0;
        NewStudent instance = new NewStudent();
        int expResult = 0;
        int result = instance.getstudentId(studentID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getname method, of class NewStudent.
     */
    @Test
    public void testGetname() {
        System.out.println("getname");
        String name = "";
        NewStudent instance = new NewStudent();
        String expResult = "";
        String result = instance.getname(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getfathersName method, of class NewStudent.
     */
    @Test
    public void testGetfathersName() {
        System.out.println("getfathersName");
        String fathersName = "";
        NewStudent instance = new NewStudent();
        String expResult = "";
        String result = instance.getfathersName(fathersName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getcoursename method, of class NewStudent.
     */
    @Test
    public void testGetcoursename() {
        System.out.println("getcoursename");
        String coursename = "";
        NewStudent instance = new NewStudent();
        String expResult = "";
        String result = instance.getcoursename(coursename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getbranchname method, of class NewStudent.
     */
    @Test
    public void testGetbranchname() {
        System.out.println("getbranchname");
        String branchname = "";
        NewStudent instance = new NewStudent();
        String expResult = "";
        String result = instance.getbranchname(branchname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
