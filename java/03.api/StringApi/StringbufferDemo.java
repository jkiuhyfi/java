package StringApi;

public class StringbufferDemo {

    public static void main(String[] args) {

        //  stringbuffer  内容可变,线程安全，适合于多线程
        StringBuffer buffer = new StringBuffer();
        buffer.append("内容可变");
        buffer.append("多线程");
        buffer.append("线程安全");
        System.out.println("--------------");
        //stringbuilt :内容可变,适合于单线程
        StringBuilder builder = new StringBuilder();
        buffer.append("内容可变");
        buffer.append("单线程");
        System.out.println(buffer);

    }
}
