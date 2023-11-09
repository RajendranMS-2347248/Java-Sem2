package Lab;

public class lab2_2 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello There!");

        // Append
        sb.append("  General Kenobi!!");
        System.out.println("After append(): " + sb);

        // Insert
        sb.insert(11, " A Great Meme");
        System.out.println("After insert(): " + sb);

        // Replace
        sb.replace(22, 25, " From Star Wars");
        System.out.println("After replace(): " + sb);

        // Delete
        sb.delete(16, 24);
        System.out.println("After delete(): " + sb);

        // charAt
        char ch = sb.charAt(5);
        System.out.println("Character at index 5: " + ch);

        // setCharAt
        sb.setCharAt(5, 'o');
        System.out.println("After setCharAt(): " + sb);

        // length
        int length = sb.length();
        System.out.println("Length of the string: " + length);

        // capacity
        int capacity = sb.capacity();
        System.out.println("Capacity of the string buffer: " + capacity);

        // ensureCapacity
        sb.ensureCapacity(40);
        System.out.println("Capacity after ensureCapacity(): " + sb.capacity());

        // toString
        String str = sb.toString();
        System.out.println("String representation: " + str);

        // substring(int start)
        String substring1 = sb.substring(10);
        System.out.println("Substring from index 10: " + substring1);

        // substring(int start, int end)
        String substring2 = sb.substring(5, 15);
        System.out.println("Substring from index 5 to 14: " + substring2);
    }
}


