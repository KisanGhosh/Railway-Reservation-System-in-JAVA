package sample;

public class AvailabilityInfo {

    private String train_number;

    private String sleeper;
    private String ac_two;
    private String ac_three;
    private String first_class;
    private String cc;
    private String ac_cc;
    private String date_travel;


    public AvailabilityInfo(){
        this.train_number = "";

        this.sleeper = "";
        this.ac_two = "";
        this.ac_three ="";
        this.first_class="";
        this.cc ="";
        this.ac_cc = "";
        this.date_travel = "";


    }

    public AvailabilityInfo(String train_number,  String sleeper, String ac_two,
                            String ac_three, String first_class, String cc, String ac_cc,String date_travel){

        this.train_number = train_number;

        this.sleeper = sleeper;
        this.ac_two = ac_two;
        this.ac_three = ac_three;
        this.first_class= first_class;
        this.cc = cc;
        this.ac_cc = ac_cc;
        this.date_travel = date_travel;
    }

    public AvailabilityInfo(String train_number, String sleeper, String ac_two, String ac_three, String first_class, String cc, String ac_cc) {
    }


    public String getTrain_number() {
        return train_number;
    }

    public void setTrain_number(String train_number) {
        this.train_number = train_number;
    }

    public String getSleeper() {
        return sleeper;
    }

    public void setSleeper(String sleeper) {
        this.sleeper = sleeper;
    }

    public String getAc_two() {
        return ac_two;
    }

    public void setAc_two(String ac_two) {
        this.ac_two = ac_two;
    }

    public String getAc_three() {
        return ac_three;
    }

    public void setAc_three(String ac_three) {
        this.ac_three = ac_three;
    }

    public String getFirst_class() {
        return first_class;
    }

    public void setFirst_class(String first_class) {
        this.first_class = first_class;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getAc_cc() {
        return ac_cc;
    }

    public void setAc_cc(String ac_cc) {
        this.ac_cc = ac_cc;
    }
    public String getDateTravel() {
        return date_travel;
    }

    public void setDateTravel(String date_travel) {
        this.date_travel = date_travel;
    }
}
