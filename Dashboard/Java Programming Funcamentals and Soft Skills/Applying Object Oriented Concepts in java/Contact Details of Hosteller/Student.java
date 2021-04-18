public class Student{
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDepartmentId(int departmentId){
        this.departmentId=departmentId;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public int getStudentId(){
        return this.studentId;
    }
    public String getName(){
        return this.name;
    }
    public int getDepartmentId(){
        return this.departmentId;
    }
    public String getGender(){
        return this.gender;
    }
    public String getPhone(){
        return this.phone;
    }
}