package lesson7.robots;

public class Robot {
    private String robotName;
    private String headType;
    private String bodyType;
    private int robotNumber;

    public void setHeadType(String headType) {
        this.headType = headType;
    }

    public String getHeadType() {
        return headType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public String getRobotName() {
        return robotName;
    }

    public void setRobotNumber(int robotNumber) {
        this.robotNumber = robotNumber;
    }

    public int getRobotNumber() {
        return robotNumber;
    }

    @Override
    public String toString(){
        return "----Robot-" + getRobotNumber()+ "---\n" +
                "name: " + getRobotName() + '\n' +
                "head: " + getHeadType() + '\n' +
                "body: " + getBodyType() + '\n' ;
    }
}
