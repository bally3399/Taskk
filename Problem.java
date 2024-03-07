public class Problem {
    private final String name;
    private  final  Type type;
    public static boolean isSolve;

    public Problem(String name, Type type) {
        this.name = name;
        this.type = type;
    }
    public String toString(){
        return String.format("%s : %s", name , type);
    }

}
