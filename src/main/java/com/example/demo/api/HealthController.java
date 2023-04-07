package com.example.demo.api;

import com.example.demo.model.HealthResponseOk;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class HealthController implements  HealthApi{

    @Override
    public ResponseEntity<HealthResponseOk> getHealth(String xRequestID) {
        return ResponseEntity.ok(buildHealthResponse());

    }
    private HealthResponseOk buildHealthResponse() {
        return new HealthResponseOk().status(HealthResponseOk.StatusEnum.OK);
    }
}
