/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhotelan;

import java.util.Scanner;

/**
 *
 * @author samsi
 */
public class Perhotelan {
    public static void main(String[] args) {
        // TODO code application logic here
        Tamu entityObjk =new Tamu();
        QueryHotel tambah = new QueryHotel();
        Scanner input=new Scanner(System.in);
        String nama_tamu,jwb,alamat_tamu;
        long id;
        
        System.out.println("SELAMAT DATANG DI Halaman Administrasi");
        System.out.println("Apakah anda ingin menambah data ? jawab ya/no");jwb=input.nextLine();
        if(jwb.equals("ya")){
        System.out.println("Masukkan Biodata Anda :");
        System.out.print("Nama Lengkap :");nama_tamu = input.nextLine();
        System.out.print("Alamat :");alamat_tamu=input.nextLine();
        entityObjk.setNama_Tamu(nama_tamu);
        entityObjk.setAlamat_Tamu(alamat_tamu);
        tambah.Add(entityObjk);
        }
        
        System.out.println("Apakah data anda ingin dilihat kan ? jawab ya/no");jwb=input.nextLine();
        if(jwb.equals("ya")){
        tambah.Show();
        }
        
        System.out.println("Apakah data anda ingin di rubah/di hapus kan ?\n"
                + "jawab lanjut : untuk rubah "
                + "\n jawab ok : untuk hapus"
                + "\n jawab tambah : untuk tambah data");
        jwb=input.nextLine();
        
        if(jwb.equals("lanjut")){
            System.out.print("Nama :");nama_tamu = input.nextLine();
            System.out.print("Alamat :");alamat_tamu = input.nextLine();
            System.out.print("ID :");id=input.nextLong();
            tambah.update(id,nama_tamu,alamat_tamu);
            tambah.Show();
            
        }else if(jwb.equals("ok")){
            tambah.Show();
            System.out.print("Masukan ID :");id=input.nextLong();
            tambah.hapus(id);
            tambah.Show();
        }else if(jwb.equals("tambah")){
            System.out.print("Nama Lengkap :");nama_tamu = input.nextLine();
        System.out.print("Alamat :");alamat_tamu=input.nextLine();
        entityObjk.setNama_Tamu(nama_tamu);
        entityObjk.setAlamat_Tamu(alamat_tamu);
        tambah.Add(entityObjk);
        
        }
    }
}
    