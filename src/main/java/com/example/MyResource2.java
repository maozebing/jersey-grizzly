package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 描述 ：
 *
 * @author : maozebing
 * @version : v1.00
 * @CreationDate : 17-5-16 下午10:57
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
@Path("myresource2")
public class MyResource2 {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "myresource2";
    }

}
