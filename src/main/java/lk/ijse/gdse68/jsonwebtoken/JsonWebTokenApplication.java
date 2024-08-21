package lk.ijse.gdse68.jsonwebtoken;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JsonWebTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonWebTokenApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper(){
        //model mapper  library for object mapping->user and userDto
        return new ModelMapper();
    }

}
