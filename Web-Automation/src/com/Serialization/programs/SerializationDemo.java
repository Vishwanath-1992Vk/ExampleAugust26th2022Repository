package com.Serialization.programs;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		writeObjectFile();

	}
	private static void writeObjectFile()
	{
		FileOutputStream fout = null;
		ObjectOutputStream out=null;
		Employee obj =null;

		try
		{
			fout= new FileOutputStream("C:\\Example\\Employee.ser");
			out=new ObjectOutputStream(fout);
			obj=new Employee("Santosh",7211,"Manager",8500);

			out.writeObject(obj);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				out.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}


