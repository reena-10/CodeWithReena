// Professor | Department | University | UniversityArray

package array;

public class Department {
   private int departmentid; 
   private String departmentname;
public Department(int departmentid, String departmentname, Professor professor) {
	super();
	this.departmentid = departmentid;
	this.departmentname = departmentname;
}
public int getDepartmentid() {
	return departmentid;
}
public void setDepartmentid(int departmentid) {
	this.departmentid = departmentid;
}
public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}
@Override
public String toString() {
	return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname + "]";
}

}
