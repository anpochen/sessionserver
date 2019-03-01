package com.session.server;

import com.session.server.model.DeliverySession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("nbi")
public class Server {

    @PostMapping("deliverysession")
    public void doPost(@RequestParam(name = "id") Long id, DeliverySession deliverySession){

        try {
            Thread.sleep(1000);



        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
