class ObjClass {
    int id;
    String name;

    public ObjClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "["+"Id: "+id+", Name: "+name+"]";
    }

    public static void main(String[] args) {
        ObjClass obj1 = new ObjClass(101, "Alice");
        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());
        System.out.println(Integer.toHexString(obj1.hashCode()));
        System.err.println(obj1);


        System.err.println(obj1.getClass());
        System.err.println(obj1.getClass().getName());

        System.err.println(obj1.getClass().getName()+"@"+Integer.toHexString(obj1.hashCode()));
    }
}