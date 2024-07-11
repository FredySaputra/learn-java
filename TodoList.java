/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodoListJavaDasar;

/**
 *
 * @author Fred
 */
public class TodoList {
    public static String[] data = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    public static void main(String[] args) {
       viewTampilTodoList();
    }
    
    
    
    
    //menampilkan todo list
    public static void tampilTodoList()
    {
        
        for(var i=0;i<data.length;i++){
    
        var todo = data[i];
        var no = i + 1;
        
        if(todo != null){
            System.out.println(no + ". "+todo);
        }
    }
        
    }
    
    
    //menambah todolist
    public static void tambahTodoList(String todo)
    {
        //mengecek bila data penuh
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                isFull = false;
                break;
            }
        }
        
        //bila data penuh mengkali 2 array data
        if (isFull){
            var temp = data;
           data = new String[data.length * 2];
            for (int i = 0; i < temp.length; i++) {
                data[i]= temp[i];
                
            }
        }
        
        
        //Menambah todo 
        for(var i=0;i<data.length;i++){
        if(data[i] == null){
            data[i] = todo;
            break;
        }
        
        }
    }
    
    public static void testTambahTodoList(){
        for (int i = 1; i <= 25; i++) {
            tambahTodoList("Menambah data ke-"+i);
            
        }
        viewTampilTodoList();
    }
    
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    
    public static void tesInput(){
        var name = input("Nama");
        System.out.println("Hi "+name);
        
        var prodi = input("Prodi");
        System.out.println("Program Studi "+prodi);
    }
    
    //menghapus todolist
    public static boolean hapusTodoList(Integer number)
    {
        if((number-1)>=data.length){
        return false;
        }else if(data[number-1] == null){
        return false;
        }else
        {
            for (int i = (number - 1); i < data.length; i++) {
                if (i == (data.length - 1)) {
                  data[i] = null;
                }else{
                    data[i] = data[i+1];
                }
                
            }
            return true;
        }
    }
    
    public static void testHapusTodoList(){
        tambahTodoList("satu");
        tambahTodoList("dua");
        tambahTodoList("tiga");
        
        var hasil = hapusTodoList(2);
        System.out.println(hasil);
        viewTampilTodoList();
        
    
    }
    
    
    //3 Block View
    public static void viewTampilTodoList(){
         while(true){ 
         System.out.println("TODOLIST");
         tampilTodoList();
         System.out.println("MENU");
         System.out.println("1. Tambah");
         System.out.println("2. Hapus");
         System.out.println("x. Selesai");
          
         var input = input("Pilih");
         
         if(input.equals("1")){
             viewTambahTodoList();
         }else if(input.equals("2")){
             viewHapusTodoList();
         }else if(input.equals("x")){
         break;
         }else{
             System.out.println("Maaf,input pilihan hanya yang ada di menu saja");
         }
        }
        
        
    }
    
    //unit test view tampil
    public static void testViewTampilTodoList()
    {  tambahTodoList("Satu");
       tambahTodoList("Dua");
       tambahTodoList("Tiga");
        viewTampilTodoList();
    }
    
    public static void viewTambahTodoList(){
        System.out.println("MENAMBAH TODOLIST");
        var todo = input("TODO (x untuk batal)");
        
        if(todo.equals("x")){
        //batal
        }else{
            tambahTodoList(todo);
        }
    }
    
    public static void testViewTambahTodoList(){
    viewTambahTodoList();
    
    viewTampilTodoList();
    }
    
    
    public static void viewHapusTodoList(){
        System.out.println("MENGHAPUS TODOLIST");
        var number = input("Nomor yang dihapus (x untuk batal)");
        
        if(number.equals("x")){
            //batal
        }else{
        boolean success = hapusTodoList(Integer.valueOf(number));
        if(!success){
            System.out.println("Gagal Menghapus Data");
        }
        }
        }
    
    public static void testViewHapusTodoList(){
        tambahTodoList("Satu");
        tambahTodoList("Dua");
        
        viewTampilTodoList();
        viewHapusTodoList();
        viewTampilTodoList();
    }
    
    
}
