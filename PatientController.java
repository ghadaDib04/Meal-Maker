package MealMaker.MealMakerApp.Patients;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import MealMaker.MealMakerApp.Patients.PatientRepository;
import java.util.List;

@RestController
@RequestMapping(path = "/MealMakerApp")
public class PatientController {


    @Autowired
    PatientRepository patientRepository;
    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping
    public List<Patient> getPatients() {
        new ResponseEntity<>( "List" , HttpStatus.OK);
        return patientRepository.findAll();
    }

    @PostMapping("/addPatient")
    public Patient addTask(@Valid @RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    @PutMapping ("/changeName/{id}/{FirstName}")
    public ResponseEntity changeName(@PathVariable Integer id , @PathVariable String FirstName) {
        boolean exist = patientRepository.existsById(id);
        if(exist){
            Patient patient = patientRepository.getById(id);
            patient.setFirstnamePat(FirstName);
            patientRepository.save(patient);
            return new ResponseEntity<>( "Name is updates" , HttpStatus.OK);
        }
        return new ResponseEntity<>( "Patient dosn't exist" , HttpStatus.BAD_REQUEST);
    }

    @PutMapping ("/changeLastN/{id}/{LastName}")
    public ResponseEntity chaneLastN(@PathVariable Integer id , @PathVariable String LastName) {
        boolean exist =patientRepository.existsById(id);
        if(exist){
            Patient patient = patientRepository.getById(id);

            patient.setLastnamePat(LastName);
            patientRepository.save(patient);
            return new ResponseEntity<>( "Last name is updates" , HttpStatus.OK);
        }
        return new ResponseEntity<>( "Patient dosn't exist" , HttpStatus.BAD_REQUEST);
    }


}
