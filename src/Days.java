public enum Days {
    MONDAY("Дуйшомбу куну жава окуйм"),
    TUESDAY("Шейшемби куну англиский окуйм"),
    THURSDAY("Шаршемби куну жава окуйм"),
    WENDESDAY("Бейшемби куну английский окуйм"),
    FRIDAY("Жума куну жава окуйм"),
    SATURDAY("Ишемби жава окуйм"),
    SUNDAY("Жекшемби дем алыш куну");
    private String kName;

    Days(String kName) {
        this.kName = kName;
    }

    @Override
    public String toString() {
        return "Days{" +
                "kName='" + kName + '\'' +
                '}';
    }
}
