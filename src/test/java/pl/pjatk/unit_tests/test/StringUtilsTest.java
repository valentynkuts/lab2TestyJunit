package pl.pjatk.unit_tests.test;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.unit_tests.StringUtils;

public class StringUtilsTest {
    @Test
    public void ala_ma_kotaReturnALA_MA_KOTA(){
        Assert.assertEquals("ALA_MA_KOTA", StringUtils.toUpperCase("ala_ma_kota"));
    }

}
