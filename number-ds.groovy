// Example
class NumberDs{
    static void main(String[] args){
        int i = 10 , j = 20,k;
        k = i + j
        println("value of k is "+k)

    }
}

// ========== Build-In Function =============
// xxxValue()
class xxxValue{
    static void main(String[] args){
        int i = 10 

        println("x.doubleValue()"+i.doubleValue())
        println("x.byteValue()"+i.byteValue())
        println("x.floatValue()"+i.floatValue())
        println("x.longValue()"+i.longValue())
        println("x.shortValue()"+i.shortValue())
        println("x.intValue()"+i.intValue())


    }
}

// compareTo() - return 1 or 0 or -1

class CompareTo{
    static void main(String[] args){
        int i = 10 

        println("Less "+i.compareTo(5) + "\n")
        println("Equal "+i.compareTo(10) + "\n")
        println("greater "+i.compareTo(15) + "\n")
 
    }
}

// equals() - return true or false

class Equalsfn{
    static void main(String[] args){
        int i = 10 

        println("Less "+i.equals(5) + "\n")
        println("Equal "+i.equals(10) + "\n")
 
    }
}

// toString() - convert into string

class toStringfn{
    static void main(String[] args){
        int i = 10 

        println("toString() "+i.toString() + "\n")
   
 
    }
}

// parseInt() - data type into int

class parseIntfn{
    static void main(String[] args){
        int i = Integer.parseInt("10")

        println("parseInt() "+i)
 
    }
}

// min and max

class MinMaxFun{
    static void main(String[] args){
        
        println("Min value"+Math.min(10.0,20.0)+"\n")
        println("Max value"+Math.max(30.3,40.5)+"\n")

    }
}