package com.tns.cm;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class CertificateService
{
@Autowired
private  CertificateRepository repo;
public List< Certificate> listAll()
{
return repo.findAll();
}
public void save( Certificate product)
{
repo.save(product);
}
public Certificate get(Integer id)
{
return repo.findById(id).get();
}
public void delete(Integer id)
{
repo.deleteById(id);
}
}