package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.test.entity.Student;
import utils.ExcelExportUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }


    public void testExcelAnnotation() throws IOException, IllegalAccessException {
        Student student1 = new Student("ivy", 18);
        Student student2 = new Student("claude", 30);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        ExcelExportUtil.reflectExport(list);
    }
}
