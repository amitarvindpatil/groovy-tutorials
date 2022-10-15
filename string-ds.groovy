// String Example

class StringExample{
    static void main(String[] args){
        String s = "Amit Patil"
        String s1 = 'groovy'
        String s2 = "'Python" + "Groovy'"
        String s3 = 'groovy'*3
        String s4 = "Amit Patil"

        println(s)
        println(s1)
        println(s2)
        println(s3)
        // Length of string
        println("length of s "+s.length())

        // concat() function
        println("Concat of s "+s.concat("lang"))

        // endsWith()
        println("endsWith of s "+s.endsWith("."))

        // equalsIgnoreCase - This method returns true if the argument is not null and the Strings are equal, ignoring case; false otherwise.
        println("endsWith of s "+s.equalsIgnoreCase(s4))

        // Matchs()
        println("matches of s "+s.matches("Amit(.*)"))
        
        // padLeft()
        println(s.padLeft(16,'*'));

        // padRight
        println(a.padRight(14,'*')); 

        // plus - append string

        println(s.plus("Sangli")); 

        // replaceAll()
        println(s.replaceAll("Amit","Bye"));

        // reverse() function
        println(s.reverse());

        // split()
        println(s.split(" "));

        // substring()
        println(s.substring(10,14));

        // toUpperCase()
        println(s.toUpperCase());

        // toLowerCase()

        println(s.toLowerCase());
    }
}

// Built-in Methods


