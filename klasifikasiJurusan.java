import java.util.Scanner;

public class klasifikasiJurusan {
    public static void main(String[] args) {
        //delkarasi
        Scanner input = new Scanner(System.in);
        String NIM;

        //input nama
        System.out.println("Masukan NIM");
        NIM = input.nextLine();

        System.out.println("Nim anda adalah " + NIM);
        System.out.println(" ");

        //percabangan maskimal 7 karakter
        if(NIM.length() <= 7) {
            //percabangan teknik
            if(NIM.startsWith("T")) {
                System.out.println("Fakultas : Teknik");
                    if ("01".equals(NIM.substring(1, 3))) {
                        System.out.println("Jurusan : Teknik Sipil");
                        System.out.println("Angkatan : 20" + NIM.substring(3,5));
                    }
                    else if("02".equals(NIM.substring(1, 3))) {
                        System.out.println("Jurusan : Teknik Mesin");
                        System.out.println("Angkatan : 20" + NIM.substring(3,5));
                    }
                    else if("03".equals(NIM.substring(1, 3))) {
                        System.out.println("Jurusan : Teknik Industri");
                        System.out.println("Angkatan : 20" + NIM.substring(3,5));
                    }
                    else {
                        System.out.println("NIM tidak ditemukan");
                    }
                }

            //percabangan kedokteran    
            else if(NIM.startsWith("K")) {
                System.out.println("Fakultas : Kedokteran");
                    if ("01".equals(NIM.substring(1, 3))) {
                        System.out.println("Jurusan : Kedokteran");
                        System.out.println("Angkatan : 20" + NIM.substring(3,5));
                    }
                    else if("02".equals(NIM.substring(1, 3))) {
                        System.out.println("Jurusan : Psikologi");
                        System.out.println("Angkatan : 20" + NIM.substring(3,5));
                    }
                    else {
                        System.out.println("NIM tidak ditemukan");
                    }
            }

            //percanbangan mipa
            else if(NIM.startsWith("M")) {
                System.out.println("Fakultas : MIPA");
                    if ("01".equals(NIM.substring(1, 3))) {
                        System.out.println("Jurusan : Matematika");
                        System.out.println("Angkatan : 20" + NIM.substring(3,5));
                    }
                    else if("02".equals(NIM.substring(1, 3))) {
                        System.out.println("Jurusan : Fisika");
                        System.out.println("Angkatan : 20" + NIM.substring(3,5));
                    }
                    else if("03".equals(NIM.substring(1, 3))) {
                        System.out.println("Jurusan : Kimia");
                        System.out.println("Angkatan : 20" + NIM.substring(3,5));
                    }
                    else if("04".equals(NIM.substring(1,3))) {
                        System.out.println("Jurusan : Biologi");
                        System.out.println("Angkatan : 20" + NIM.substring(3,5));
                    }
                    else {
                        System.out.println("NIM tidak ditemukan");
                    }
                }

            //data tidak ditemukan
            else {
                System.out.println("data anda tidak ditemukan");
            }
        
        //data lebih dari 7 karakter
        }
        else {
            System.out.println("NIM anda tidak valid");
        }
    }
}
