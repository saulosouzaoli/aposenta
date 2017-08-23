package br.edu.ifg.aposenta.web;

import br.edu.ifg.aposenta.web.action.CreateAction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by diogodil on 22/08/17.
 */
@RestController("v1/aposenta")
public class ApossentaController {


    @GetMapping
    public ResponseEntity<?> get(
            @RequestParam("password") String password) {

        return ResponseEntity.ok("ok");
    }

    @PostMapping
    public ResponseEntity<?> create(
            @RequestBody CreateAction createAction) {

        return ResponseEntity.ok("ok");
    }
}
