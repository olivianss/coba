package nyobain.overloading;

// //import hewan.PantheraLeo;

// public class Pantheraleo { 
//     private String name;
//     private String id;
//     private String colour;
//     private String gender;
//     private int yearOfBirth;
//     //contoh field
//     static int staticfieldA; // karena di kelas ga bakal utrun ke objek
//     //static private int staticfieldA // sama ja
//     static int getFieldA(){
//         return staticfieldA;
//     }

// //constructor dipanggil saat instansiasi
// public Pantheraleo() {
//    this ("not defined", "anonymus", "not defined", "male"); // sama aja kaya yg dibawah. this ini manggil construtor yg ada di dalam class. parameter ada 4 maka nanti dipanggil condtructor yg punya 4 paramterr
//    // gaboleh manggil constructor tidak pada langkah pertama
// yearOfBirth = 2000;
// //     id = "not defined";
// //     name = "anonymus";
// //     colour = "not defined";
// //     gender = "male";
//  }

// private Pantheraleo(String id) { 
//     this.id = id;//this referensi terhadap objek yg saat itu jdi fokus
//    // this.setid(id);
// }

// private Pantheraleo(String id, String name) {
//     this.id = id;
//     this.name = name;
// }

// private Pantheraleo(String id, String name, String colour, String gender) {
//     this.id = id;
//     this.name = name;
//     this.colour = colour;
//     this.gender = "male";

// //static member itu bisa field atau method

// }



// }

public class Pantheraleo {
    private String id;
    private String color;
    private String gender;
    private String name;
    private int yearOfBirth;
    static int staticFieldA; // ini adalah static field member, boleh ada access modifier di depannya (private, public)
    static int getFieldA(){ //ini adalah  static method member
        return staticFieldA; 
    }
    public Pantheraleo(){
        this("not defined", "Anonymous", "Not defined", "Male"); //tak boleh memakai nama, dan harus pada line pertama method tersebut
        // id = "not defined";
        // name = "Anonymous";
        // color = "Not defined";
        // gender = "Male";
        //bisa juga dengan panggil method lain
    }
    private Pantheraleo(String id){
        this.id = id;
        this.setId(id);// this bisa diikuti dengan method, jadi bisa kasi field atau method
    }
    public Pantheraleo(String id, String name, String color){
        this.id = id;
        this.name = name;
        this.color = color;
    }
    public Pantheraleo(String id, String name, String color, String gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.color = color;
    }
    public void setId(String inputId) {
        id = inputId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getGender() {
        return gender;
    }
    public String eat(){
        return "Hau hau hau...";
    }
    public String roar(){
        return "Hoaaar...!";
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth() {
        int umur = 2024 - yearOfBirth;
        return umur;
    }
    public int getYear(){
        return yearOfBirth;
    }
}
