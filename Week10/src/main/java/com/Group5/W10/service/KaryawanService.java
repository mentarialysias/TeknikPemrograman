package com.Group5.W10.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.Group5.W10.model.karyawan;  
import com.Group5.W10.repository.karyawanRepository;  

@Service  
public class KaryawanService {  
	@Autowired
	karyawanRepository karyawanRepository;  
	
	public List<karyawan> getAllkaryawan(){  
		List<karyawan> karyawan = new ArrayList<karyawan>();  
		karyawanRepository.findAll().forEach(karyawan1 -> karyawan.add(karyawan1));  
		return karyawan;  
	}	  
	public karyawan getBooksById(int id)   {  
		return karyawanRepository.findById(id).get();  
	}  

	public void saveOrUpdate(karyawan karyawan) {  
		karyawanRepository.save(karyawan);  
	}  

	public void delete(int id)  {  
		karyawanRepository.deleteById(id);  
	}  

	public void update(karyawan karyawan, int id) {  
		karyawanRepository.save(karyawan);  
	}  
}  