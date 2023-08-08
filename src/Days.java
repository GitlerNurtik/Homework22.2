public enum Days {
    MONDAY("Понедельник","в понедельник","дүйшөмбү"),
    TUESDAY("Вторник","во вторник", "Шейшемби"),
    WEDNESDAY("Среда","в среду","шаршемби"),
    THURSDAY("Четверг","в четверг","бейшемби"),
    FRIDAY("Пятница", "в пятницу","жума"),
    SATURDAY("Суббота", "в субботу", "ишемби"),
    SUNDAY("Воскресенье", "в воскресенье", "жекшемби");
    private String name;
    private String nameOfPadezh;
    private String nameOfKG;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfPadezh() {
        return nameOfPadezh;
    }

    public void setNameOfPadezh(String nameOfPadezh) {
        this.nameOfPadezh = nameOfPadezh;
    }

    public String getNameOfKG() {
        return nameOfKG;
    }

    public void setNameOfKG(String nameOfKG) {
        this.nameOfKG = nameOfKG;
    }

    Days(String name, String nameOfPadezh, String nameOfKG) {
        this.name = name;
        this.nameOfPadezh = nameOfPadezh;
        this.nameOfKG = nameOfKG;
    }
}
