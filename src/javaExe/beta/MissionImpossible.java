//package javaExe.beta;
//
//import java.lang.reflect.*;
//import java.lang.annotation.*;
//import java.util.Map;
//
//public class MissionImpossible {
//    public static String carryOut (String codeName) {
//        try {
//            Class genus = Genus.class;
//            Method method = genus.getClass().getDeclaredMethod("vent");
//
//            method.setAccessible(true);
//
//            Object[] args = null;
//            Object ob = method.invoke(genus);
//            System.out.println("ob" + " : " + ob);
//
//            Object container = method.invoke(new Genus());
//            Class containerClass = container.getClass();
//
//            Annotation annotation = containerClass.getAnnotation(Note.class);
//            System.out.println("annotation " + " : " + annotation.toString());
//            int code = ((Note) annotation).value();
//            System.out.println("code: " + code);
//
//            Method open = containerClass.getDeclaredMethod("open", int.class);
//            open.setAccessible(true);
//
//            Map<String, String> map = (Map) open.invoke(container, code);
//            System.out.println("map: " + map);
//
//            for (String name : map.keySet()) {
//                if (name.equals(codeName)) {
//                    System.out.println("key: " + name + " - " + map.get(name));
//                    return map.get(name);
//                }
//            }
//        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException nsme) {
//            nsme.printStackTrace();
//        }
//        return "";
//    }
//
//    public static String carryOut2(String codeName) {
//        Genus genus = new Genus();
//        Object obj = null;
//        Map<String, String> mp = null;
//        try{
//            Method vent = genus.getClass().getDeclaredMethod("vent");
//            vent.setAccessible(true);
//            obj = vent.invoke(genus);
////            obj = vent.invoke(genus, new Object[]{}); // SECOND OPTION
//
//
//            Note note = obj.getClass().getAnnotation(Note.class);
//
//            Method open = obj.getClass().getDeclaredMethod("open", int.class);
//            open.setAccessible(true);
//
//            mp = (Map<String, String>) open.invoke(obj, note.value());
//        }
//        catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e ){
//            e.printStackTrace();
//        }
//        return mp.get(codeName);
//    }
//}
