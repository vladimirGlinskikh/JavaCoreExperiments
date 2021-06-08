package functionalInterfaces.I5;

public class NamedStringProcessor implements StringProcessor {
    StringProcessor anonymousSP = String::toUpperCase;

    @Override
    public String process(String s) {
        return s;
    }
}
