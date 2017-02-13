package com.feicuiedu.junittestdemo.network;

import com.feicuiedu.junittestdemo.model.UserResult;
import com.google.gson.Gson;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import okhttp3.Call;
import okhttp3.Response;

import static org.junit.Assert.*;

/**
 * Created by gqq on 2017/2/13.
 * 创建的EasyShopClient的测试类
 */
public class EasyShopClientTest {

    private EasyShopClient mClient;

    /**
     * @Before：测试方法执行之前会执行：作用：初始化工作
     * @After:测试方法执行之后会执行：作用：释放资源，对象置空
     * @Test：要测试的方法：测试用例
     * @BeforeClass:只会被执行一次的静态方法：数据库的连接等
     * @AfterClass:只会被执行一次的静态方法：数据库断开连接等
     * 执行顺序
     * BeforeClass--Before--Test--After--AfterClass
     *
     * 断言的方法：验证需要测试的内容
     *
     */

    @Before
    public void setUp() throws Exception {
        mClient = EasyShopClient.getInstance();
    }

    @Test
    public void register() throws Exception {
        Call call = mClient.register("123456", "123456");
        Response response = call.execute();
        assertNull(response);
    }

    @Test
    public void register1() throws Exception {
        Call call = EasyShopClient.getInstance().register("123456", "123456");
        Response response = call.execute();
        String json = response.body().string();
        UserResult userResult = new Gson().fromJson(json, UserResult.class);
        assertEquals(1,userResult.getCode());
    }

    @Test
    public void login() throws Exception {
        Call call =  mClient.login("123456", "123456");
        Response response = call.execute();
        assertNull(response.body());
    }

    @After
    public void tearDown() throws Exception {
        mClient = null;
    }
}