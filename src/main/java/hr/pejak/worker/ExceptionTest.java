package hr.pejak.worker;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;

public class ExceptionTest {

    public void run() throws IOException, ParseException {
        Timestamp time = new Timestamp(System.currentTimeMillis());
        long timestamp = time.getTime();


        if (timestamp % 2 == 0) {
            throw new ParseException("Test with Parse Exception", 1);
        } else {
            throw new IOException("Test with IO Exception");
        }

    }

    public void calculate (int x){

        int  n = 3;

        try {
            float result = n % x;
            System.out.println(result);
        } catch (Exception e){
            System.out.println("There was an Error: " + e.toString());
        }

    }

}
