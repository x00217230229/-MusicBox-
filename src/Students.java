
    import java.util.Scanner;  
  
    public class Students{  
        private String studentId;  
        private String name;  
        private int extraActivities;  
      
     
        public Students(String studentId, String name, int extraActivities) {  
            this.studentId = studentId;  
            this.name = name;  
            this.extraActivities = extraActivities;  
        }  
      
        // Getter for studentId  
        public String getStudentId() {  
            return studentId;  
        }  
      
        // Setter for studentId  
        public void setStudentId(String studentId) {  
            this.studentId = studentId;  
        }  
      
        // Getter for name  
        public String getName() {  
            return name;  
        }  
      
        // Setter for name  
        public void setName(String name) {  
            this.name = name;  
        }  
      
        // Getter for extraActivities  
        public int getExtraActivities() {  
            return extraActivities;  
        }  
      
        // Setter for extraActivities  
        public void setExtraActivities(int extraActivities) {  
            this.extraActivities = extraActivities;  
        }  
      
          
        public static void main(String[] args) {  
            Scanner scanner = new Scanner(System.in);  
            System.out.println("please input student's number:");  
            int numberOfStudents = scanner.nextInt();  
      
             
            Students[] students = new Students[numberOfStudents];  
      
            for (int i = 0; i < numberOfStudents; i++) {  
                System.out.println("please input " + (i + 1) + " student's ID:");  
                String studentId = scanner.next();  
      
                System.out.println("please input " + (i + 1) + " student's name:");  
                String name = scanner.next();  
      
                System.out.println("please input " + (i + 1) + " actional number:");  
                int extraActivities = scanner.nextInt();  
      
                 
                students[i] = new Students(studentId, name, extraActivities);  
            }  
      
             
            for (Students student : students) {  
                System.out.println("student's number: " + student.getStudentId());  
                System.out.println("student's name: " + student.getName());  
                System.out.println("actinal number: " + student.getExtraActivities());  
                System.out.println();  
            }  
      
            scanner.close();  
        }  
    }

