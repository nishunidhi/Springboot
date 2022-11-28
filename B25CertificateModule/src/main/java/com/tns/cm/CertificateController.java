package com.tns.cm;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class CertificateController
{
@Autowired
private CertificateService service;
// RESTful API methods for Retrieval operations
@GetMapping("/certi")
public List<Certificate> list()
{
return service.listAll();
}
@GetMapping("/certi/{id}")
public ResponseEntity<Certificate> get(@PathVariable Integer id)
{
try
{
	Certificate product = service.get(id);
return new ResponseEntity<Certificate>(product, HttpStatus.OK);
}
catch (NoSuchElementException e)
{
return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
}
}
// RESTful API method for Create operation
@PostMapping("/certi")
public void add(@RequestBody Certificate product)
{
service.save(product);
}
// RESTful API method for Update operation
@PutMapping("/certi/{id}")
public ResponseEntity<?> update(@RequestBody Certificate product, @PathVariable Integer id)
{
try
{
	Certificate existProduct = service.get(id);
service.save(product);
return new ResponseEntity<>(HttpStatus.OK);
}
catch (NoSuchElementException e)
{
return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
}
// RESTful API method for Delete operation
@DeleteMapping("/certi/{id}")
public void delete(@PathVariable Integer id)
{
service.delete(id);
}
}