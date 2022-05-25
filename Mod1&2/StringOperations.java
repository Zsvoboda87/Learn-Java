public class StringOperations {
    public static void main(String[] args){
        String me = "Zachary Svoboda";
        System.out.println(me);
        String newme = me.replace('Z', 'A');
        System.out.println(newme);
        String newme2 = newme.substring(0, 14).concat("z");
        System.out.println(newme2);        
        String url = "www.zack.com";
        System.out.println(url);
        String url2 = url.substring(4, 8);
        String url3 = url2.concat("1331");
        System.out.println(url3);
}
}