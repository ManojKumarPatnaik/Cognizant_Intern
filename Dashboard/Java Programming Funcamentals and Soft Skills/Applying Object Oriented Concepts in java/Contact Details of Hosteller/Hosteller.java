public class Hosteller extends Student{
    private String hostelName;
    private int roomNumber;
    public void setStudentId(int studentId){
        this.setStudentId(studentId);
    }
    public void setName(String name){
        this.setName(name);
    }
    public void setDepartmentId(int departmentId){
        this.setDepartmentId(departmentId);
    }
    public void setGender(String gender){
        this.setGender(gender);
    }
    public void setPhone(String phone){
        this.setPhone(phone);
    }
    public int getStudentId(){
        return this.getStudentId();
    }
    public String getName(){
        return this.getName();
    }
    public int getDepartmentId(){
        return this.getDepartmentId();
    }
    public String getGender(){
        return this.getGender();
    }
    public String getPhone(){
        return this.getPhone();
    }
    public void setHostelName(String hostelName){
        this.hostelName=hostelName;
    }
    
    
    public void setRoomNumber(int roomNumber){
        this.roomNumber=roomNumber;
    }
    
    public String getHostelName(){
        return this.hostelName;
    }
    
    public int getRoomNumber(){
        return this.roomNumber;
    }
    public String toString(){
        return getStudentId()+" "+getName()+" "+getDepartmentId()+" "+getGender()+" "+getPhone()+" "+getHostelName()+" "+getRoomNumber();
    }
}