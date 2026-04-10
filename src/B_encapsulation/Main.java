package B_encapsulation;

class School{
    private String schoolName;
    private String schoolType;
    private int schoolRegionID;

    public School(String schoolName, String schoolType, int schoolRegionID) {
        this.schoolName = schoolName;
        this.schoolType = schoolType;
        this.schoolRegionID = schoolRegionID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public int getSchoolRegionID() {
        return schoolRegionID;
    }

    public void setSchoolRegionID(int schoolRegionID) {
        this.schoolRegionID = schoolRegionID;
    }


    public String getschoolFullData() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolType='" + schoolType + '\'' +
                ", schoolRegionID=" + schoolRegionID +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        School obj = new School("KV vidyalaya","CBSE",001);


        obj.setSchoolName("DAV International");


        String schoolData = obj.getschoolFullData();
        System.out.println(schoolData);

    }
}
