package it.cedacri.util;

public class ArgsInputParser {
    private ArgsInputParser() {
    }

    public static void parseMessage(String[] args){
        new ArgsInput(getByIndex(args,0));
    }

    private static String getByIndex(String[] args, int index){
        if (index < args.length && args[index] != null){
            return args[index];
        }
        return null;
    }
}
