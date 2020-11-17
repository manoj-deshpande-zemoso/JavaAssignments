package assignment04;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDates {

    private Main main = new Main();
    private SimpleDateFormat sdf = main.sdf;

    @Test
    public void testValidDateRanges() throws ParseException {
        Assert.assertEquals(main.validateKYC(sdf.parse("16-07-1998"), sdf.parse("27-06-2017")), "16-06-2017 27-06-2017");
        Assert.assertEquals(main.validateKYC(sdf.parse("04-02-2016"), sdf.parse("04-04-2017")), "05-01-2017 06-03-2017");
        Assert.assertEquals(main.validateKYC(sdf.parse("04-04-2015"), sdf.parse("04-04-2016")), "05-03-2016 04-04-2016");
        Assert.assertEquals(main.validateKYC(sdf.parse("04-04-2015"), sdf.parse("15-03-2016")), "05-03-2016 15-03-2016");
    }

    @Test
    public void testInvalidDateRanges() throws ParseException {
        Assert.assertEquals(main.validateKYC(sdf.parse("04-05-2017"), sdf.parse("04-04-2017")), "No range");
    }

    @Test(expected = ParseException.class)
    public void testParseExceptions() throws ParseException {
        Assert.assertEquals(main.validateKYC(sdf.parse("04-Jun-2017"), sdf.parse("04-Apr-2017")), "No range");
    }

}
