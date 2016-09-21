package baidu;

import company.baidu.BigHomes;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Rookie on 2016/9/21.
 * Description:
 */
public class BigHomesTest {
    Logger logger = LoggerFactory.getLogger(BigHomesTest.class);

    @Test
    public void bigHomes() throws Exception {
        int[][] grid = {};
        Assert.assertEquals(BigHomes.bigHomes(grid),0);
    }

    @Test
    public void bigHomes2() throws Exception {
        int[][] grid = {{0,0,0,0,0},{0,1,1,0,0},{0,0,0,0,0},{0,0,1,1,0},{0,0,1,0,0}};
        Assert.assertEquals(BigHomes.bigHomes(grid),3);
    }

    @Test
    public void bigHomes3() throws Exception {
        int[][] grid = {{0,0,0,0,0},{0,1,1,0,0},{1,0,0,0,1},{1,0,1,1,0},{0,0,0,0,0}};
        Assert.assertNotEquals(BigHomes.bigHomes(grid),3);
    }

    @Test
    public void bigHomes4() throws Exception {
        int[][] grid = {{0,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,0}};
        Assert.assertEquals(BigHomes.bigHomes(grid),1);
    }
}