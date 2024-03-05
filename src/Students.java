
    import java.util.Scanner;  
  
    public class Students{  
        private String studentId;  
        private String name;  
        private int extraActivities;  
      
        // 构造函数  
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
      
        // 用于获取用户输入并创建学生对象的工具方法  
        public static void main(String[] args) {  
            Scanner scanner = new Scanner(System.in);  
            System.out.println("请输入学生数量:");  
            int numberOfStudents = scanner.nextInt();  
      
            // 创建一个学生数组来存储所有学生信息  
            Students[] students = new Students[numberOfStudents];  
      
            for (int i = 0; i < numberOfStudents; i++) {  
                System.out.println("请输入第 " + (i + 1) + " 个学生的ID:");  
                String studentId = scanner.next();  
      
                System.out.println("请输入第 " + (i + 1) + " 个学生的名字:");  
                String name = scanner.next();  
      
                System.out.println("请输入第 " + (i + 1) + " 个学生参与的额外活动数量:");  
                int extraActivities = scanner.nextInt();  
      
                // 创建学生对象并添加到数组中  
                students[i] = new Students(studentId, name, extraActivities);  
            }  
      
            // 打印所有学生信息  
            for (Students student : students) {  
                System.out.println("学生ID: " + student.getStudentId());  
                System.out.println("学生名字: " + student.getName());  
                System.out.println("额外活动数量: " + student.getExtraActivities());  
                System.out.println();  
            }  
      
            scanner.close();  
        }  
    }

