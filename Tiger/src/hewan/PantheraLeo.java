package hewan;

public class PantheraLeo {
   
        private String id;
        private String colour;
        private String gender;
        private int yearOfBirth;
        public static int staticFieldA; 
    
        public void setId(String inputId) {//tujuan set id unutk mengisikan field id
            id = inputId;
        }
       
        public String getId(){
            return id;
        }
        
        public String eat(){
            return "hau hau hau...";
        }
        
        public String roar(){
            //System.out.println("Roarrrr");
            return "Hoarrr"; 
        }

        public int getYear(){
            return yearOfBirth;
        }
}





