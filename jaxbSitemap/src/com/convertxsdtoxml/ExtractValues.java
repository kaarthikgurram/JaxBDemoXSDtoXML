package com.convertxsdtoxml;

import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.generated.StudentType;

public class ExtractValues  {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		
		StudentType student = new StudentType();
		
		student.setFirstname("karthik");
		student.setLastname("gurram");
		student.setNickname("Guddu");
		student.setMarks(BigInteger.valueOf(100));
		student.setRollno(BigInteger.valueOf(23));
		
		JAXBContext context = JAXBContext.newInstance(StudentType.class);
		
		Marshaller marshaller = context.createMarshaller();

		marshaller.marshal(student, System.out);
	}

}
