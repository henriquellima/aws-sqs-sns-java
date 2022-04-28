package com.hennriquellima.awssqssns;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static com.hennriquellima.awssqssns.AWS.SNSService.sendMessage;
import static com.hennriquellima.awssqssns.AWS.SQSService.messageReader;

@RestController
public class Controller {
    @GetMapping("/sendmessage/{message}")
    public ResponseEntity<String> sendEmail(@PathVariable("message") String message){
        System.out.println(message);
        sendMessage(message);
        return ResponseEntity.ok("Mensagem Enviada");
    }

    @GetMapping("/processqueue")
    public ResponseEntity<String> clearQueue(){
        messageReader();

        return ResponseEntity.ok("Uma mensagem foi processada, verifique o terminal para ver essa mensagem.");
    }
}
