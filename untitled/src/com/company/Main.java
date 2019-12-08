package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		List<Mahasiswa> data = new LinkedList<>();
		Scanner x= new Scanner(System.in);
		int a=1;
		while(a ==1 ){
			Mahasiswa dataMahasiswa = new Mahasiswa();
			System.out.print("choice : 1. Tambah /n "+"2. Berhenti = " );
			String input = x.next();
			if (a != Integer.valueOf(input)) {
				break;
			}else{
				System.out.print("Nama : ");
				input = x.next();
				System.out.print("NIM : ");
				String input1 = x.next();
				System.out.print("Alamat : ");
				String input2 = x.next();
				dataMahasiswa.setAlamat(input2);
				dataMahasiswa.setNama(input);
				dataMahasiswa.setNim(input1);
				data.add(dataMahasiswa);
			}
		}
		System.out.println("====================================");
		System.out.println("Nama \t"+"NIM \t"+"Alamat \t");
		for (int i = 0; i <data.size(); i++) {
			System.out.print(data.get(i).getNama()+"\t");
			System.out.print("\t"+data.get(i).getNim()+"\t");
			System.out.print("\t"+data.get(i).getAlamat()+"\t");
		}


    }
}
