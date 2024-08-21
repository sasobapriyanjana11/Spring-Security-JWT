package lk.ijse.gdse68.jsonwebtoken;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonWebTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonWebTokenApplication.class, args);
    }

    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
