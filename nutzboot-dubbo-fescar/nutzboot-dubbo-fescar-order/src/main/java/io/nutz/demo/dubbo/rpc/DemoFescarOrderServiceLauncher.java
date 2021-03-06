package io.nutz.demo.dubbo.rpc;

import io.nutz.demo.bean.Order;
import org.nutz.boot.NbApp;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

@IocBean(create = "init")
public class DemoFescarOrderServiceLauncher {

    @Inject
    Dao dao;

    public void init() {
        dao.create(Order.class, false);
    }

    public static void main(String[] args) throws Exception {
        new NbApp().run();
    }

}
