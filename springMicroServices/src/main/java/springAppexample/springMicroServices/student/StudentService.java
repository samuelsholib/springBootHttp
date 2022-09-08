package springAppexample.springMicroServices.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent() {
        return List.of(
                new Student(10L,
                        "mariah",
                        "mariah.cantwell@gmail.com",
                        LocalDate.of(2001, Month.JANUARY, 23),
                        20

                )
        );
    }
}
