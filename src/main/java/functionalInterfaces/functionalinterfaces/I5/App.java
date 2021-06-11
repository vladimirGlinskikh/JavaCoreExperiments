package functionalInterfaces.functionalinterfaces.I5;

public class App {
    public static void main(String[] args) {
        NamedStringProcessor namedSP = new NamedStringProcessor();
        StringProcessor anonSP = s -> s.toUpperCase();

        System.out.println(namedSP.process("namedSP.process()"));
        System.out.println(anonSP.process("anonymousSP.process()"));
    }
}
