public class Demo1 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("my name is dinesh shyamlal ahuja")
                ;
        s1.append("my fathers name is shyamlal gobindram ahuja");
        System.out.println(s1);
        //s1.delete
        String s2 = "Dinesh";
        System.out.println(s2);
        s2 = s1.toString();
        System.out.println(s2);
        s2 = s2.replace("name","?");
        System.out.println(s2);
    }
}
