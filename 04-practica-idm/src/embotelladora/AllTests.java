package embotelladora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@SuiteClasses({ EmbotelladoraTest.class })

public class AllTests
{
    // Execution begins in main(). This test class executes a
    // test runner that tells the tester if any fail.
    public static void main (String[] args)
    {
       junit.textui.TestRunner.run (suite());
    }

    // The suite() method helps when using JUnit 3 Test Runners or Ant.
    public static junit.framework.Test suite()
    {
       return new JUnit4TestAdapter (AllTests.class);
    }
}