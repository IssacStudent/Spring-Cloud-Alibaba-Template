package com.gupaoedu.book.dubbo;

import com.gupaoedu.book.dubbo.spi.Driver;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void connectTest(){
        ExtensionLoader<Driver> extensionLoader=ExtensionLoader.getExtensionLoader(Driver.class);
        Driver driver=extensionLoader.getExtension("mysqlDriver");
        System.out.println(driver.connect());
    }

    @Test
    public void testAdaptiveExtension() {
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
//        protocol.export()
    }
}
