public class Main {
    public static void main(String[] args) {
        int n;
        Student sv1 = new Student();
        Student sv2 = new Student();
        Student sv3 = new Student();
        
        System.out.println(sv1.toString());
        
//        System.out.println("Ma sv: "+sv1.id);
        System.out.println("Ma sv: "+sv1.getId());
//        sv1.id = 2;
        sv1.setId(2);
        System.out.println("Ma sv: "+sv1.getId());
//        sv1.name = "Vu Van Huy";
        System.out.println("Ma sv: "+sv1.getId());
        sv1.setName("Vu Van Huy");
//        System.out.println("Ten sv: "+ sv1.name);
        System.out.println("Ten sv: "+ sv1.getName());
        
//        System.out.println("Ten sv: "+ sv1.age);
        System.out.println("Ten sv: "+ sv1.getAge());
        sv1.setAge(88);
        System.out.println("Ten sv: "+ sv1.getAge());
        
//        System.out.println("Ten sv: "+ sv1.gpa);
        System.out.println("Ten sv: "+ sv1.getGpa());
        sv1.setGpa(8.8f);
        System.out.println("Ten sv: "+ sv1.getGpa());
        
        System.out.println(sv1.toString());
        
        Student sv4 = new Student(4, "Tran Thu Trang", 19, 7.0f);
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
        System.out.println(sv4.toString());
    }
}
