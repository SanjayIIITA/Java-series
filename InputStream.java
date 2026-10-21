import java.io.*;

public class InputStream {
    public static void main(String[] args) throws IOException {

        // Step 4: InputStreamReader converts bytes → characters
        // InputStreamReader isr = new InputStreamReader(System.in);

        // Step 5: BufferedReader reads characters and stores as String
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine(); // reads full line → "Sanjay"

        System.out.println("Welcome " + name);
    }
}

/*
 * Flow of Input: "Sanjay"
 *
 * Step 1: User types "Sanjay" on keyboard
 *
 * Step 2: OS Buffer converts keystrokes → stream of bytes (ASCII values)
 *         'S'=83, 'a'=97, 'n'=110, 'j'=106, 'a'=97, 'y'=121
 *         then converts ASCII → Binary (84 → 01010011 ...)
 *
 * Step 3: System.in (InputStream) receives the stream of bytes
 *         System.in → [83, 97, 110, 106, 97, 121]
 *
 * Step 4: InputStreamReader converts bytes → characters
 *         [83, 97, 110, 106, 97, 121] → ['S', 'a', 'n', 'j', 'a', 'y']
 *
 * Step 5: BufferedReader reads characters → stores as String
 *         br.readLine() → "Sanjay" → stored in name
 *
 * Step 6: System.out.println("Welcome " + name) → Welcome Sanjay
 */
